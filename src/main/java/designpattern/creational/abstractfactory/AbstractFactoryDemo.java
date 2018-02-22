package designpattern.creational.abstractfactory;

public class AbstractFactoryDemo {
  public static void main(String[] args) {
    AbstractFactory factoryA = FactoryProducer.getFactory("FactoryA");

    IObjA objA1 = factoryA.getObjA("objA1");
    objA1.show();
    
    IObjA objA2 = factoryA.getObjA("objA2");
    objA2.show();
    
    AbstractFactory factoryB = FactoryProducer.getFactory("FactoryB");

    IObjB objB1 = factoryB.getObjB("objB1");
    objB1.show();
    
    IObjB objB2 = factoryB.getObjB("objB2");
    objB2.show();
  }
}