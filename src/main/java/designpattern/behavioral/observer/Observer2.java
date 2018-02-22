package designpattern.behavioral.observer;

public class Observer2 extends AbstractObserver {

  public Observer2(Obj obj) {
    this.obj = obj;
    this.obj.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Observer 2 : " + obj.getState());
  }
}