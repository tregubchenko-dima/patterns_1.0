package pattern.structural.composite;

public interface Component {

    void printName();

    void add(Component component);

    Component get(int i);
}
