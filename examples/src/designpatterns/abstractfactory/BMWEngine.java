package designpatterns.abstractfactory;

public class BMWEngine implements CarEngine {
  @Override
  public String toString() {
    return getClass().toString();
  }
}
