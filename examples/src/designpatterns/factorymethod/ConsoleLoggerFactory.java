package designpatterns.factorymethod;

public class ConsoleLoggerFactory extends LoggerFactory {
  @Override
  public Logger getLogger() {
    return new ConsoleLogger();
  }
}