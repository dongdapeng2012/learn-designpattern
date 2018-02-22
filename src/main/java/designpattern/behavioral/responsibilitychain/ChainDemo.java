package designpattern.behavioral.responsibilitychain;

public class ChainDemo {

  private static AbstractObj getChainOfLoggers() {

    AbstractObj obj3 = new Obj3(AbstractObj.LEVEL3);
    AbstractObj obj2 = new Obj2(AbstractObj.LEVEL2);
    AbstractObj obj1 = new Obj1(AbstractObj.LEVEL1);

    obj3.setNextObj(obj2);
    obj2.setNextObj(obj1);

    return obj3;
  }

  public static void main(String[] args) {
    AbstractObj objChain = getChainOfLoggers();

    objChain.logMessage(AbstractObj.LEVEL1, "Level 1 information.");

    objChain.logMessage(AbstractObj.LEVEL2, "Level 2 information.");

    objChain.logMessage(AbstractObj.LEVEL3, "Level 3 information.");
  }
}