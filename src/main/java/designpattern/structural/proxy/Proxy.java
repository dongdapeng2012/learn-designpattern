package designpattern.structural.proxy;

public class Proxy implements IObj {

  private Obj obj;
  private String param1;

  public Proxy(String param1) {
    this.param1 = param1;
  }

  @Override
  public void display() {
    if (obj == null) {
      obj = new Obj(param1);
    }
    obj.display();
  }
}