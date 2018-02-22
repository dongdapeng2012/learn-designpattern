package designpattern.structural.facade;

public class Facade {
  private IObj obj1;
  private IObj obj2;

  public Facade() {
    obj1 = new Obj1();
    obj2 = new Obj2();
  }

  public void obj1Method() {
    obj1.method();
  }

  public void obj2Method() {
    obj2.method();
  }
}