package pattern.structural.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new BlackColor());
        Shape rectangle = new Rectangle(new WhiteColor());

        triangle.showShape();
        rectangle.showShape();
    }
}
