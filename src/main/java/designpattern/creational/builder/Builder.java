package designpattern.creational.builder;

public class Builder {

  Obj obj;

  public Builder() {
    obj = new Obj();
  }

  public void buildProp(String prop) {
    obj.setProp(prop);
  }

  public Obj buildObj1() {
    buildProp("Object with prop1");
    return obj;
  }

  public Obj buildObj2() {
    buildProp("Object with prop2");
    return obj;
  }
}