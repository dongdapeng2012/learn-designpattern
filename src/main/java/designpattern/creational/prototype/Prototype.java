package designpattern.creational.prototype;

import java.util.ArrayList;

class Prototype implements Cloneable {

  public String name = null;
  public int age = 0;
  public String sex = null;
  public ArrayList<String> listProp = new ArrayList<>();
  public ObjProp objProp = null;

  public Prototype(String name, ArrayList<String> listProp) {
    this.name = name;
    this.listProp = listProp;
    objProp = new ObjProp();
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPersonal(String sex, int age) {
    this.age = age;
    this.sex = sex;
  }

  public void setObjProp(String timeArea, String company) {
    objProp.timeArea = timeArea;
    objProp.company = company;
  }

  /**
   * ��дclone()����Ϊpublic��Ϊÿ���ֶζ������µĶ���ʵ�����
   */
  @Override
  public Prototype clone() throws CloneNotSupportedException {
    int age = this.age;
    String sex = this.sex;
    String name = new String(this.name);
    ArrayList<String> famMem = new ArrayList<>(this.listProp);

    Prototype copy = new Prototype(name, famMem);
    copy.setPersonal(sex, age);
    copy.setObjProp(this.objProp.timeArea, this.objProp.company);
    return copy;
  }

  public void display() {
    System.out.println(this.name + " " + this.sex + " " + this.age);
    System.out.print("Family member: ");
    for (String elem : listProp)
      System.out.print(elem + " ");
    System.out.println();
    System.out.print("Work experience: " + this.objProp.timeArea);
    System.out.println(" " + this.objProp.company);
  }

}