package designpattern.behavioral.observer;

public class ObserverDemo {
  public static void main(String[] args) {
    Obj obj = new Obj();

    new Observer1(obj);
    new Observer2(obj);

    System.out.println("1st state : 15");
    obj.setState(15);
  }
}