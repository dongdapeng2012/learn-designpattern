package designpattern.behavioral.responsibilitychain;

public class Obj2 extends AbstractObj {

  public Obj2(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Object Level 2 : " + message);
  }
}