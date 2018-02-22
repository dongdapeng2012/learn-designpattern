package designpattern.behavioral.interpreter;

public class InterpreterDemo {

  public static void main(String[] args) {
    IObj obj1 = new Obj("xxx");
    IObj obj2 = new Obj("yyy");

    System.out.println("Object 1 is xxx? " + obj1.interpret("xxx"));
    System.out.println("Object 2 is xxx? " + obj2.interpret("xxx"));
  }
}