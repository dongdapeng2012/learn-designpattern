package designpattern.behavioral.mediator;

public class Obj {
  public static void showMessage(Mediator mediator, String message) {
    System.out.println(mediator.getName() + " : " + message);
  }
}