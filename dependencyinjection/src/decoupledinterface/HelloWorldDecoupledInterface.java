package decoupledinterface;

public class HelloWorldDecoupledInterface {

  public static void main(String[] args) {
    final MessageRenderer mr = new StandardOutMessageRenderer();
    final MessageProvider mp = new HelloWorldMessageProvider();
    mr.setMessageProvider(mp);
    mr.render();
  }
}
