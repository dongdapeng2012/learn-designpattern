package designpattern.behavioral.memento;

public class MemUser {
  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public Memento saveStateToMemento() {
    return new Memento(state);
  }

  public void getStateFromMemento(Memento Memento) {
    state = Memento.getState();
  }
}