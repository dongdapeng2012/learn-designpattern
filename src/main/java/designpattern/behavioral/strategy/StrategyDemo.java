package designpattern.behavioral.strategy;

public class StrategyDemo {
  public static void main(String[] args) {
    Operator obj = new Operator(new Strategy1());
    System.out.println("10 + 5 = " + obj.exec(10, 5));

    obj = new Operator(new Strategy2());
    System.out.println("10 * 5 = " + obj.exec(10, 5));
  }
}