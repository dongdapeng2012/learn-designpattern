package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Obj {
  private String name;
  private String param;
  private List<Obj> subObj;

  public Obj(String name, String param1) {
    this.name = name;
    this.param = param1;
    subObj = new ArrayList<Obj>();
  }

  public void add(Obj e) {
    subObj.add(e);
  }

  public void remove(Obj e) {
    subObj.remove(e);
  }

  public List<Obj> getSubObj() {
    return subObj;
  }

  public String toString() {
    return ("Employee :[ Name : " + name + ", param1 : " + param + " ]");
  }
}