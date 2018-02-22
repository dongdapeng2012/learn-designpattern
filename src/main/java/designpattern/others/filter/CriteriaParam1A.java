package designpattern.others.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaParam1A implements ICriteria {

  @Override
  public List<Obj> meetCriteria(List<Obj> objs) {
    List<Obj> objA = new ArrayList<Obj>();
    for (Obj obj : objs) {
      if (obj.getParam1().equalsIgnoreCase("A")) {
        objA.add(obj);
      }
    }
    return objA;
  }
}