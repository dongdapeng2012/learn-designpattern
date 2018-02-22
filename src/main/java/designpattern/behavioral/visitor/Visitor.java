package designpattern.behavioral.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(Obj obj) {
        System.out.println("Displaying Object.");
    }
}