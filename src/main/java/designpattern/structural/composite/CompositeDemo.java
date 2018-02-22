package designpattern.structural.composite;

public class CompositeDemo {
  public static void main(String[] args) {
    Obj obj1 = new Obj("obj1", "CEO");
    Obj obj2 = new Obj("obj2", "Head Sales");
    Obj obj3 = new Obj("obj3", "Head Marketing");
    Obj obj4 = new Obj("obj4", "Marketing");
    Obj obj5 = new Obj("obj5", "Sales");

    obj1.add(obj2);
    obj1.add(obj3);
    obj2.add(obj5);
    obj3.add(obj4);

    System.out.println(obj1);
    for (Obj head : obj1.getSubObj()) {
      System.out.println(" |- "+ head);
      for (Obj ee : head.getSubObj()) {
        System.out.println(" |   |- "+ ee);
      }
    }
  }
}