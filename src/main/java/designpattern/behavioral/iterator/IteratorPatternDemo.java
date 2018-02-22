package designpattern.behavioral.iterator;

public class IteratorPatternDemo {

  public static void main(String[] args) {
    Obj obj = new Obj();

    for (IIterator iter = obj.getIterator(); iter.hasNext();) {
      String name = (String) iter.next();
      System.out.println("Object : " + name);
    }
  }
}