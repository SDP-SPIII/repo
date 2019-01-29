package decoupledwithfactory;

public class HelloWorldDecoupledWithFactory {

  public static void main(String... args) {
    final MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
    final MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
    mr.setMessageProvider(mp);
    mr.render();
  }
}