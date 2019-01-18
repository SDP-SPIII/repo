package designpatterns.abstractfactory;

public class FordFactory implements CarFactoryInterface {

  @Override
  public CarEngine getEngine() {
    return new FordEngine();
  }

  @Override
  public CarWindow getWindow() {
    return new FordWindow();
  }

}
