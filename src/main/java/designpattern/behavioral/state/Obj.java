package designpattern.behavioral.state;

public class Obj {
  private IState state;

  public Obj() {
    state = null;
  }

  public void setState(IState state) {
    this.state = state;
  }

  public IState getState() {
    return state;
  }
}