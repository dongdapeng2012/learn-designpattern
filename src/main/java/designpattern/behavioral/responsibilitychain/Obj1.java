package designpattern.behavioral.responsibilitychain;

public class Obj1 extends AbstractObj {

  public Obj1(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Object Level 1 : " + message);
  }
}