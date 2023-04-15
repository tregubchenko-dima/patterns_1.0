package pattern.structural.flyweight;

public class Circle implements Shape {
    int r = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("Circle("+x+","+y+"):R="+r);
    }
}
