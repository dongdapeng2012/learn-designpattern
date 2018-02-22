package designpattern.behavioral.mediator;

public class Mediator {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Mediator(String name) {
    this.name = name;
  }

  public void sendMessage(String message) {
    Obj.showMessage(this, message);
  }
}