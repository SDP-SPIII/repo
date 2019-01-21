package decoupledwithfactory;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
  private final String FILENAME = "dependencyinjection/resources/bean.properties";

  private static MessageSupportFactory instance = null;

  static {
    instance = new MessageSupportFactory();
  }

  private Properties props = null;
  private MessageRenderer renderer = null;
  private MessageProvider provider = null;

  private MessageSupportFactory() {
    props = new Properties();

    try {
      props.load(new FileInputStream(FILENAME));

      // get the implementation classes
      String rendererClass = props.getProperty("renderer.class");
      String providerClass = props.getProperty("provider.class");

      renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
      provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
    } catch (Exception ex) {
      System.err.println("Failed to create factory methods");
      ex.printStackTrace();
    }
  }

  public static MessageSupportFactory getInstance() {
    return instance;
  }

  public MessageRenderer getMessageRenderer() {
    return renderer;
  }

  public MessageProvider getMessageProvider() {
    return provider;
  }

}