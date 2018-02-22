package designpattern.others.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaDemo {
  public static void main(String[] args) {
    List<Obj> objs = new ArrayList<Obj>();

    objs.add(new Obj("Obj1", "A", "X"));
    objs.add(new Obj("Obj2", "A", "Y"));
    objs.add(new Obj("Obj3", "B", "X"));
    objs.add(new Obj("Obj4", "B", "Y"));

    ICriteria param1A = new CriteriaParam1A();
    ICriteria param2X = new CriteriaParam2X();
    ICriteria param1A2X = new OrCriteria(param2X, param1A);

    System.out.println("Param1=A: ");
    printObjs(param1A.meetCriteria(objs));

    System.out.println("Param1=A Or Param2=X: ");
    printObjs(param1A2X.meetCriteria(objs));
  }

  public static void printObjs(List<Obj> objs) {
    for (Obj obj : objs) {
      System.out.println("Object : [ Name : " + obj.getName() + ", Param1 : " + obj.getParam1() + ", Param2 : "
          + obj.getParam2() + " ]");
    }
  }
}