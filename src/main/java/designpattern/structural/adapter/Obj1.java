package designpattern.structural.adapter;

public class Obj1 implements IObj {

  @Override
  public void methodInObj2(String fileName) {
  }

  @Override
  public void methodInObj1(String fileName) {
    System.out.println("ObjB1 : " + fileName);
  }
}