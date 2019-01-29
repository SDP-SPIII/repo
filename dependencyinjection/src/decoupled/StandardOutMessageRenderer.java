package decoupled;

public class StandardOutMessageRenderer {

  private HelloWorldMessageProvider messageProvider;

  public void render() {
    if (messageProvider == null) {
      throw new RuntimeException("You must set the property messageProvider of class:"
              + this.getClass().getName());
    }
    System.out.println(messageProvider.getMessage());
  }

  public void setMessageProvider(HelloWorldMessageProvider provider) {

    this.messageProvider = provider;
  }

}