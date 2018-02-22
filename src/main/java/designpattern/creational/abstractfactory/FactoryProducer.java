package designpattern.creational.abstractfactory;

public class FactoryProducer {
  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("FactoryA")) {
      return new FactoryA();
    }else if (choice.equalsIgnoreCase("FactoryB")) {
      return new FactoryB();
    }
    return null;
  }
}