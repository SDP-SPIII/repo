package decoupled;

public class HelloWorldDecoupled {

  public static void main(String[] args) {
    final StandardOutMessageRenderer mr = new StandardOutMessageRenderer();
    final HelloWorldMessageProvider mp = new HelloWorldMessageProvider();
    mr.setMessageProvider(mp);
    mr.render();
  }
}
