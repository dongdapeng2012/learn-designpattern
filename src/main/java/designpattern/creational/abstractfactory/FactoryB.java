package designpattern.creational.abstractfactory;

public class FactoryB extends AbstractFactory {
  @Override
  public IObjB getObjB(String objType) {
    if (objType == null) {
      return null;
    }
    if (objType.equalsIgnoreCase("objB1")) {
      return new ObjB1();
    } else if (objType.equalsIgnoreCase("objB2")) {
      return new ObjB1();
    }

    return null;
  }

  @Override
  IObjA getObjA(String obj) {
    // TODO Auto-generated method stub
    return null;
  }
}