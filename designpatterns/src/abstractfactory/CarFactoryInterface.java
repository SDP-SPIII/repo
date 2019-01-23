package abstractfactory;

// An interface is a good choice for the abstract
// factory itself

public interface CarFactoryInterface {

  CarWindow getWindow();

  CarEngine getEngine();
}
