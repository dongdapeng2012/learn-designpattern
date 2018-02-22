package designpattern.creational.abstractfactory;

public class FactoryA extends AbstractFactory {
  @Override
  public IObjA getObjA(String objType) {
    if (objType == null) {
      return null;
    }
    if (objType.equalsIgnoreCase("objA1")) {
      return new ObjA1();
    }
    if (objType.equalsIgnoreCase("objA2")) {
      return new ObjA2();
    }

    return null;
  }

  @Override
  IObjB getObjB(String obj) {
    // TODO Auto-generated method stub
    return null;
  }
}