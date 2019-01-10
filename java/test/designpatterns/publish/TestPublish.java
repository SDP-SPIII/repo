package designpatterns.publish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPublish {

  @Test
  void publish() {
    PCLNewsAgency observable = new PCLNewsAgency();
    PCLNewsChannel observer = new PCLNewsChannel();

    observable.addPropertyChangeListener(observer);
    observable.setNews("news");

    assertEquals(observer.getNews(), "news");
  }
}