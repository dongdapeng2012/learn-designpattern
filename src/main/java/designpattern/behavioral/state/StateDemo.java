package designpattern.behavioral.state;

public class StateDemo {
  public static void main(String[] args) {
    Obj obj = new Obj();

    State1 obj1 = new State1();
    obj1.changeState(obj);
    System.out.println(obj.getState().toString());

    State2 obj2 = new State2();
    obj2.changeState(obj);
    System.out.println(obj.getState().toString());
  }
}