package designpattern.structural.proxy;

public class ProxyDemo {

  public static void main(String[] args) {
    IObj proxy = new Proxy("Object");

    System.out.println("\nLoad object");
    proxy.display();

    System.out.println("\nnot load object");
    proxy.display();
  }
}