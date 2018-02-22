package designpattern.behavioral.state;

public class State2 implements IState {

  public void changeState(Obj obj) {
    System.out.println("Object changes to state 2");
    obj.setState(this);
  }

  public String toString() {
    return "State 2";
  }
}