package designpattern.structural.bridge;

public class Obj extends AbstractObj {
  private int x;

  public Obj(int x, IMethod method) {
    super(method);
    this.x = x;
  }

  public void realMethod() {
    method.objMethod(x);
  }
}