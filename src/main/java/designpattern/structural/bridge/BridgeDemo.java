package designpattern.structural.bridge;

public class BridgeDemo {
  public static void main(String[] args) {
    AbstractObj obj1 = new Obj(10, new Method1());
    AbstractObj obj2 = new Obj(20, new Method2());

    obj1.realMethod();
    obj2.realMethod();
  }
}