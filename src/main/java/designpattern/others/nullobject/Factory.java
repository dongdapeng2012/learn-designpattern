package designpattern.others.nullobject;

public class Factory {

  public static final String[] names = { "Rob", "Joe" };

  public static AbstractObj getCustomer(String name) {
    for (int i = 0; i < names.length; i++) {
      if (names[i].equalsIgnoreCase(name)) {
        return new Obj(name);
      }
    }
    return new NullObj();
  }
}