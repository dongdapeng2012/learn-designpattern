package designpattern.behavioral.observer;

public abstract class AbstractObserver {
  protected Obj obj;

  public abstract void update();
}