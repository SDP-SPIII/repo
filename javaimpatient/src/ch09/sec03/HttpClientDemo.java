package ch09.sec03;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HttpClientDemo {
  public static String solution = "public class Numbers {\n" + "    public int countSevens(int n) {\n"
          + "        int r = 0;\n" + "        while (n > 0) {\n" + "            if (n % 10 == 7) r++;\n"
          + "            n /= 10;\n" + "        }\n" + "        return r;\n" + "    }" + "}";

  public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
    System.out.println("GET demo");
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(new URI("http://horstmann.com")).GET().build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());

    System.out.println("\n\n\nPOST demo");
    client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS).build();
    Map<String, String> postData = new HashMap<>();
    postData.put("repo", "bj4cc");
    postData.put("problem", "ch06/c06_exp_6_105");
    postData.put("level", "1");
    postData.put("Numbers.java", solution);
    boolean first = true;
    StringBuilder body = new StringBuilder();
    for (Map.Entry<String, String> entry : postData.entrySet()) {
      if (first)
        first = false;
      else
        body.append('&');
      body.append(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8));
      body.append('=');
      body.append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
    }

    request = HttpRequest.newBuilder().uri(new URI("http://codecheck.it/check")).header("Accept-Charset", "UTF-8")
            .header("Content-Type", "application/x-www-form-urlencoded")
            .POST(HttpRequest.BodyPublishers.ofString(body.toString())).build();
    response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
  }
}
