package designpattern.others.nullobject;

public class NullDemo {
  public static void main(String[] args) {

    AbstractObj obj1 = Factory.getCustomer("Rob");
    AbstractObj obj2 = Factory.getCustomer("Bob");

    System.out.println("Customers");
    System.out.println(obj1.getName());
    System.out.println(obj2.getName());
  }
}