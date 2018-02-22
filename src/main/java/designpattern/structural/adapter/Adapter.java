package designpattern.structural.adapter;

public class Adapter implements IAdapter {

  IObj objB;

  @Override
  public void methodInObj(String obj, String fileName) {
    if (obj.equalsIgnoreCase("ObjB1")) {
      objB = new Obj1();
      objB.methodInObj1(fileName);
    } else if (obj.equalsIgnoreCase("ObjB2")) {
      objB = new Obj2();
      objB.methodInObj2(fileName);
    }
  }
}