package designpattern.behavioral.state;

public class State1 implements IState {

  public void changeState(Obj obj) {
    System.out.println("Object changes to state 1");
    obj.setState(this);
  }

  public String toString() {
    return "State 1";
  }
}