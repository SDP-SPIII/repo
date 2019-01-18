package lombokexamples.general;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;

@Log
class LogExample {

  public static void main(String... args) {
    log.severe("Something's wrong here");
  }
}

@CommonsLog(topic = "CounterLog")
class LogExampleCategory {

  public static void main(String... args) {
    log.error("Calling the 'CounterLog' with a message");
  }
}