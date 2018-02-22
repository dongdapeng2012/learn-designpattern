package designpattern.structural.decorator;

public abstract class AbstractDecorator implements IObj {
  protected IObj obj;

  public AbstractDecorator(IObj decoratedObj) {
    this.obj = decoratedObj;
  }

  public void draw() {
    obj.draw();
  }
}