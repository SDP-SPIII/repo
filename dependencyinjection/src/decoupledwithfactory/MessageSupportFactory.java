package decoupledwithfactory;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class MessageSupportFactory {
  private static MessageSupportFactory instance;
  private static MessageRenderer renderer;
  private static MessageProvider provider;

  static {
    instance = new MessageSupportFactory();
  }

  private MessageSupportFactory() {
    final String FILENAME = "dependencyinjection/resources/bean.properties";
    final Properties props = new Properties();

    try {
      props.load(Files.newInputStream(Paths.get(FILENAME)));

      // get the implementation classes
      final String rendererClass = props.getProperty("renderer.class");
      final String providerClass = props.getProperty("provider.class");

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