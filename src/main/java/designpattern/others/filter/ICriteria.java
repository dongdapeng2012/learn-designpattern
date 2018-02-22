package designpattern.others.filter;

import java.util.List;

public interface ICriteria {
  public List<Obj> meetCriteria(List<Obj> objs);
}