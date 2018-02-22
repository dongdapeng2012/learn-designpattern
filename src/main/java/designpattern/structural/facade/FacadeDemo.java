package designpattern.structural.facade;

public class FacadeDemo {
  public static void main(String[] args) {
    Facade facade = new Facade();

    facade.obj1Method();
    facade.obj2Method();
  }
}