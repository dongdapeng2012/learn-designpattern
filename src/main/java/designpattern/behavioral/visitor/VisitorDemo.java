package designpattern.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {

        IObj obj = new Obj();
        obj.setVisitor(new Visitor());
    }
}