package designpattern.creational.abstractfactory;

public abstract class AbstractFactory {
  abstract IObjA getObjA(String obj);
  abstract IObjB getObjB(String obj);
}