package springdi.annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringWithAnnotation {

  public static void main(String[] args) throws Exception {

    // get the bean factory
    BeanFactory factory = getBeanFactory();
    MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
    mr.render();
  }

  private static BeanFactory getBeanFactory() throws Exception {
    // create a bean factory from anno.xml
    BeanFactory factory = new ClassPathXmlApplicationContext("anno.xml");
    return factory;
  }
}