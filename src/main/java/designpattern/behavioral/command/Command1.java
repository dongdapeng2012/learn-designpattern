package designpattern.behavioral.command;

public class Command1 implements ICommand {
  private Obj obj;

  public Command1(Obj obj) {
    this.obj = obj;
  }

  public void execute() {
    obj.method1();
  }
}