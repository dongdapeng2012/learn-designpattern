package designpattern.creational.factory;

public class Factory {
  public IObj getObj(String objType) {
    if (objType == null) {
      return null;
    }
    if (objType.equalsIgnoreCase("obj1")) {
      return new Obj1();
    }else if(objType.equalsIgnoreCase("obj2")){
      return new Obj2();
    }
    return null;
  }
}