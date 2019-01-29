package dixmlcons;


public class StandardOutMessageRenderer implements MessageRenderer {

  private MessageProvider messageProvider;

  public void render() {
    if (messageProvider == null) {
      throw new RuntimeException(
              "You must set the property messageProvider of class:"
                      + StandardOutMessageRenderer.class.getName());
    }

    System.out.println(messageProvider.getMessage());
  }

  public MessageProvider getMessageProvider() {
    return messageProvider;
  }

  public void setMessageProvider(MessageProvider provider) {
    messageProvider = provider;
  }

}