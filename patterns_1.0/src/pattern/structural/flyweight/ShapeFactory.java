package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapeFactory {

    Map<String, Shape> shapeByType = new HashMap<>();

    public Shape getShape(String type){
        Shape shape = shapeByType.get(type);
        if (shape == null) {
            switch (type) {
                case "circle" -> shape = new Circle();
                case "square" -> shape = new Square();
            }
            shapeByType.put(type, shape);
        }
        return shape;
    }
}
