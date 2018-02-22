package designpattern.behavioral.strategy;

public class Operator {
  private IStrategy strategy;

  public Operator(IStrategy strategy) {
    this.strategy = strategy;
  }

  public int exec(int num1, int num2) {
    return strategy.doOperation(num1, num2);
  }
}