package pattern.creational.factory.method.model;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Gav-gav");
    }
}
