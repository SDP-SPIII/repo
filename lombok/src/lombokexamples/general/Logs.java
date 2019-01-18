package lombokexamples.general;

class LogExampleOrig {
  private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());

  public static void main(String... args) {
    log.severe("Something's wrong here");
  }
}

class LogExampleCategoryOrig {
  private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
          .getLog("CounterLog");

  public static void main(String... args) {
    log.error("Calling the 'CounterLog' with a message");
  }
}