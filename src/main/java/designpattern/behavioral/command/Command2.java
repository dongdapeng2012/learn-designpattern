package designpattern.behavioral.command;

public class Command2 implements ICommand {
  private Obj obj;

  public Command2(Obj obj) {
    this.obj = obj;
  }

  public void execute() {
    obj.method2();
  }
}