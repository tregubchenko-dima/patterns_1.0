package pattern.behavior.iterator;

public class IteratorTest {

    public static void main(String[] args) {
        Container container = new Container();
        CustomIterator iterator = container.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
