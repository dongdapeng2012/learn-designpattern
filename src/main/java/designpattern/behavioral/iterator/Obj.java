package designpattern.behavioral.iterator;

public class Obj implements IObj {
  public String names[] = { "Object 1", "Object 2" };

  @Override
  public IIterator getIterator() {
    return new Iterator();
  }

  private class Iterator implements IIterator {

    int index;

    @Override
    public boolean hasNext() {
      if (index < names.length) {
        return true;
      }
      return false;
    }

    @Override
    public Object next() {
      if (this.hasNext()) {
        return names[index++];
      }
      return null;
    }
  }
}