package designpattern.behavioral.visitor;

public class Obj implements IObj {
    @Override
    public void setVisitor(IVisitor visitor) {
        visitor.visit(this);
    }
}