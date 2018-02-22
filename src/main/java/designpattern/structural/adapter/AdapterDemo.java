package designpattern.structural.adapter;

public class AdapterDemo {
  public static void main(String[] args) {
    Adapter objType = new Adapter();

    objType.methodInObj("ObjB1", "ObjB1.param");
    objType.methodInObj("ObjB2", "ObjB2.param");
  }
}