package designpattern.structural.decorator;

public class Obj implements IObj {

  private String name;
  
  public Obj(){
    this.name = "Object";
  }
  
  @Override
  public void draw() {
    System.out.println(this.name);
  }
}