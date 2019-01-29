package di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class HelloWorldSpringWithDI {
  private final static String FILENAME = "springdependencyinjection/resources/di.properties";

  public static void main(String[] args) throws Exception {

    // get the bean factory
    BeanFactory factory = getBeanFactory();

    MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
    mr.render();
  }

  private static BeanFactory getBeanFactory() throws Exception {
    // get the bean factory
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

    // create a definition reader
    PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(factory);

    // load the configuration options
    Properties props = new Properties();

    props.load(Files.newInputStream(Paths.get(FILENAME)));

    rdr.registerBeanDefinitions(props);

    return factory;
  }
}
