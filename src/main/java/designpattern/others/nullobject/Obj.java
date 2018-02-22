package designpattern.others.nullobject;

public class Obj extends AbstractObj {

  public Obj(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isNil() {
    return false;
  }
}