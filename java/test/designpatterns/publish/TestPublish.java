package designpatterns.publish;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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