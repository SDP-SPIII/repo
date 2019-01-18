package designpatterns.abstractfactoryalt;

public interface Restaurant {
  Appetizer getAppetizer();

  Entree getEntree();

  Dessert getDessert();
}