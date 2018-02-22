package designpattern.behavioral.interpreter;

public class Obj implements IObj {

  private String data;

  public Obj(String data) {
    this.data = data;
  }

  @Override
  public boolean interpret(String context) {
    if (context.contains(data)) {
      return true;
    }
    return false;
  }
}