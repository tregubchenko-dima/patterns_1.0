package pattern.behavior.visitor;

public interface Element {
    void accept(Visitor visitor);
}
