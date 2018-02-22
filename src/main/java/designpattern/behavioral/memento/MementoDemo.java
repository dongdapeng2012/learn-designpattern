package designpattern.behavioral.memento;

public class MementoDemo {
  public static void main(String[] args) {
    MemUser user = new MemUser();
    MemManager manager = new MemManager();
    user.setState("State #1");
    user.setState("State #2");
    manager.add(user.saveStateToMemento());
    user.setState("State #3");
    manager.add(user.saveStateToMemento());
    user.setState("State #4");

    System.out.println("Current State: " + user.getState());
    user.getStateFromMemento(manager.get(0));
    System.out.println("First saved State: " + user.getState());
    user.getStateFromMemento(manager.get(1));
    System.out.println("Second saved State: " + user.getState());
  }
}