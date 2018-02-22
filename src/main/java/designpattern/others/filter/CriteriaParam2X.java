package designpattern.others.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaParam2X implements ICriteria {

  @Override
  public List<Obj> meetCriteria(List<Obj> objs) {
    List<Obj> objX = new ArrayList<Obj>();
    for (Obj obj : objs) {
      if (obj.getParam2().equalsIgnoreCase("X")) {
        objX.add(obj);
      }
    }
    return objX;
  }
}