package designpattern.structural.bridge;

public class Method2 implements IMethod {
  @Override
  public void objMethod(int x) {
    System.out.println("Obj2, x: " + x);
  }
}