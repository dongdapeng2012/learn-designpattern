package designpattern.structural.bridge;

public abstract class AbstractObj {
  protected IMethod method;

  protected AbstractObj(IMethod method) {
    this.method = method;
  }

  public abstract void realMethod();
}