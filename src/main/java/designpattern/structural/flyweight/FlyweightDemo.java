package designpattern.structural.flyweight;

public class FlyweightDemo {
  private static final String colors[] = { "Red", "Green"};

  public static void main(String[] args) {

    for (int i = 0; i < 5; ++i) {
      Obj obj = (Obj) BaseObjFactory.getObj(getRandomColor());
      obj.setParam2(100);
      obj.draw();
    }
  }

  private static String getRandomColor() {
    return colors[(int) (Math.random() * colors.length)];
  }
}