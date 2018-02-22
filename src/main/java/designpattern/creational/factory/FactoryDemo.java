package designpattern.creational.factory;

public class FactoryDemo {
  public static void main(String[] args) {
    Factory shapeFactory = new Factory();

    IObj obj1 = shapeFactory.getObj("obj1");
    obj1.show();
  }
}