package designpattern.behavioral.template;

public abstract class AbstractObj {
  abstract void method();

  public final void play() {
    method();
  }
}