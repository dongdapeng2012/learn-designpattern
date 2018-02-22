package designpattern.structural.flyweight;

import java.util.HashMap;

public class BaseObjFactory {
  private static final HashMap<String, IObj> objmap = new HashMap<>();

  public static IObj getObj(String param1) {
    Obj obj = (Obj) objmap.get(param1);

    if (obj == null) {
      obj = new Obj(param1);
      objmap.put(param1, obj);
      System.out.println("Creating obj of param1 : " + param1);
    }
    return obj;
  }
}