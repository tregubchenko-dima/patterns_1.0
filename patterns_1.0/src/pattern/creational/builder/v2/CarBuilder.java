package pattern.creational.builder.v2;

public interface CarBuilder {

    CarBuilder addName();
    CarBuilder addSpeed();
    CarBuilder addColor();
    Car build();
}
