package designpattern.others.filter;

public class Obj {

  private String name;
  private String param1;
  private String param2;

  public Obj(String name, String param1, String param2) {
    this.name = name;
    this.param1 = param1;
    this.param2 = param2;
  }

  public String getName() {
    return name;
  }

  public String getParam1() {
    return param1;
  }

  public String getParam2() {
    return param2;
  }
}