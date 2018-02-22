package designpattern.structural.adapter;

public class Obj2 implements IObj {

  @Override
  public void methodInObj2(String param) {
    System.out.println("ObjB2 : " + param);
  }

  @Override
  public void methodInObj1(String fileName) {
  }
}