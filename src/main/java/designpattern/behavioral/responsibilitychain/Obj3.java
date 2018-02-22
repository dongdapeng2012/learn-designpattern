package designpattern.behavioral.responsibilitychain;

public class Obj3 extends AbstractObj {

  public Obj3(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Object Level 3 : " + message);
  }
}