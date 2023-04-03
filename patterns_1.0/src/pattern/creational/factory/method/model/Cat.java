package pattern.creational.factory.method.model;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Myau-myau");
    }
}
