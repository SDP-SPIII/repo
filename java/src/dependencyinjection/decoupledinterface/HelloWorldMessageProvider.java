package dependencyinjection.decoupledinterface;

public class HelloWorldMessageProvider implements MessageProvider {

  public String getMessage() {
    return "Hello World!";
  }

}