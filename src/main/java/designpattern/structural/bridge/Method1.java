package designpattern.structural.bridge;

public class Method1 implements IMethod {
  @Override
  public void objMethod(int x) {
    System.out.println("Obj1, x: " + x);
  }
}