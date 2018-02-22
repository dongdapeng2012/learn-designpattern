package designpattern.behavioral.mediator;

public class MediatorDemo {
  public static void main(String[] args) {
    Mediator mediator1 = new Mediator("Object 1");
    Mediator mediator2 = new Mediator("Object 2");

    mediator1.sendMessage("Hi! Object 1!");
    mediator2.sendMessage("Hello! Object 2!");
  }
}