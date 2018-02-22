package designpattern.structural.decorator;

public class Decorator extends AbstractDecorator {

  public Decorator(IObj obj) {
    super(obj);
  }

  @Override
  public void draw() {
    obj.draw();
    decorate(obj);
  }

  private void decorate(IObj obj) {
    System.out.println("is decorated");
  }
}