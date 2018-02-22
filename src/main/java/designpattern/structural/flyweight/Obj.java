package designpattern.structural.flyweight;

public class Obj implements IObj {
  private String param1;
  private int param2;

  public Obj(String param1) {
    this.param1 = param1;
  }

  public void setParam2(int param2) {
    this.param2 = param2;
  }

  @Override
  public void draw() {
    System.out.println("Object [param1 : " + param1 + ", param2 :" + param2);
  }
}