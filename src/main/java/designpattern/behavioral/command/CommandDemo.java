package designpattern.behavioral.command;

public class CommandDemo {
  public static void main(String[] args) {
    Obj obj = new Obj();

    Command1 command1 = new Command1(obj);
    Command2 command2 = new Command2(obj);

    Operator operator = new Operator();
    operator.acceptCommand(command1);
    operator.acceptCommand(command2);

    operator.executeCommond();
  }
}