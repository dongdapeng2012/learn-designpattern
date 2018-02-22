package designpattern.others.filter;

import java.util.List;

public class OrCriteria implements ICriteria {

  private ICriteria criteria1;
  private ICriteria criteria2;

  public OrCriteria(ICriteria criteria1, ICriteria criteria2) {
    this.criteria1 = criteria1;
    this.criteria2 = criteria2;
  }

  @Override
  public List<Obj> meetCriteria(List<Obj> objs) {
    List<Obj> criteria1Items = criteria1.meetCriteria(objs);
    List<Obj> criteria2Items = criteria2.meetCriteria(objs);

    for (Obj obj : criteria2Items) {
      if (!criteria1Items.contains(obj)) {
        criteria1Items.add(obj);
      }
    }
    return criteria1Items;
  }
}