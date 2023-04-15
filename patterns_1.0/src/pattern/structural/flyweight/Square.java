package pattern.structural.flyweight;

public class Square implements Shape{
    int a = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("Square("+x+","+y+"):a="+a);
    }
}
