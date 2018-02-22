package designpattern.others.nullobject;

public class NullObj extends AbstractObj {

  @Override
  public String getName() {
    return "Not Available in Customer Database";
  }

  @Override
  public boolean isNil() {
    return true;
  }
}