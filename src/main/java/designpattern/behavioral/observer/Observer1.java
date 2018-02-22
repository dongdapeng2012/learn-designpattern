package designpattern.behavioral.observer;

public class Observer1 extends AbstractObserver {

  public Observer1(Obj obj) {
    this.obj = obj;
    this.obj.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Observer 1 : " + obj.getState());
  }
}