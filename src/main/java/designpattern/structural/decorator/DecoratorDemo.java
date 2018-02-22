package designpattern.structural.decorator;

public class DecoratorDemo {
  public static void main(String[] args) {

    IObj obj = new Obj();
    IObj decoratedObj = new Decorator(new Obj());

    System.out.println("Normal Object :");
    obj.draw();

    System.out.println("\nDecorated  Object :");
    decoratedObj.draw();
  }
}