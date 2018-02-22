package designpattern.creational.builder;

public class BuilderDemo {

  public static void main(String[] args) {
    Builder builder = new Builder();

    Obj obj1 = builder.buildObj1();
    System.out.println(obj1.getProp());

    Obj obj2 = builder.buildObj2();
    System.out.println(obj2.getProp());
  }
}