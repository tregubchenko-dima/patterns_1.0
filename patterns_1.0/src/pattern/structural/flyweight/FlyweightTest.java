package pattern.structural.flyweight;

public class FlyweightTest {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle1 = shapeFactory.getShape("circle");
        Shape circle2 = shapeFactory.getShape("circle");
        Shape square1 = shapeFactory.getShape("square");
        Shape square2 = shapeFactory.getShape("square");

        System.out.println(circle1.equals(circle2));
        circle1.draw(1,1);
        circle2.draw(2,2);
    }
}
