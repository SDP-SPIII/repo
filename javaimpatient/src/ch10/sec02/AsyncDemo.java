package ch10.sec02;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AsyncDemo {
  public static void main(String[] args) throws URISyntaxException, InterruptedException {
    String urlString = "http://horstmann.com";
    ExecutorService executor = Executors.newCachedThreadPool();
    var client = HttpClient.newBuilder().executor(executor).build();
    HttpRequest request = HttpRequest.newBuilder(new URI(urlString)).GET().build();
    client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body).whenComplete((s, t) -> {
      if (t == null)
        System.out.println(s);
      else
        t.printStackTrace();
      executor.shutdown();
    });
    executor.awaitTermination(10, TimeUnit.MINUTES);
  }
}
