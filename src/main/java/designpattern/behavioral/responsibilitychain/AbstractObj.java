package designpattern.behavioral.responsibilitychain;

public abstract class AbstractObj {
  public static int LEVEL1 = 1;
  public static int LEVEL2 = 2;
  public static int LEVEL3 = 3;

  protected int level;

  protected AbstractObj nextObj;

  public void setNextObj(AbstractObj nextObj) {
    this.nextObj = nextObj;
  }

  public void logMessage(int level, String message) {
    if (this.level <= level) {
      write(message);
    }
    if (nextObj != null) {
      nextObj.logMessage(level, message);
    }
  }

  abstract protected void write(String message);
}