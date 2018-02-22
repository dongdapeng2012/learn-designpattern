package designpattern.creational.prototype;

import java.util.ArrayList;

public class PrototypeDemo {

  public static void main(String[] args) throws CloneNotSupportedException {
    ArrayList<String> famMem = new ArrayList<>(); // 家庭成员名单
    famMem.add("Papa");
    famMem.add("Mama");

    // 创建初始简历
    Prototype proto1 = new Prototype("Jobs", famMem);
    proto1.setPersonal("Male", 26);
    proto1.setObjProp("2013/8/1 - 2015/6/30", "Huawei");

    // 通过简历1复制出简历2，并对家庭成员和工作经验进行修改
    Prototype proto2 = proto1.clone();
    proto2.setName("Tom");
    proto2.listProp.add("Brother");
    proto2.setObjProp("2015/7/1 - 2016/6/30", "Baidu");

    proto1.display();
    proto2.display();
  }// main

}/* Pritotype */