package designpattern.structural.proxy;

public class Obj implements IObj {

  private String param1;

  public Obj(String param1) {
    this.param1 = param1;
    loadMethod(param1);
  }

  @Override
  public void display() {
    System.out.println("Displaying " + param1);
  }

  private void loadMethod(String param1) {
    System.out.println("Loading " + param1);
  }
}