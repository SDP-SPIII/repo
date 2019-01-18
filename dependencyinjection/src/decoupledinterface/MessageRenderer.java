package decoupledinterface;

public interface MessageRenderer {

  void render();

  MessageProvider getMessageProvider();

  void setMessageProvider(MessageProvider provider);
}
