package designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
  private List<ICommand> commandList = new ArrayList<ICommand>();

  public void acceptCommand(ICommand command) {
    commandList.add(command);
  }

  public void executeCommond() {
    for (ICommand command : commandList) {
      command.execute();
    }
    commandList.clear();
  }
}