package designpattern.behavioral.template;

public class TemplateDemo {
  public static void main(String[] args) {

    AbstractObj obj = new Obj1();
    obj.play();
    System.out.println();
    obj = new Obj2();
    obj.play();
  }
}