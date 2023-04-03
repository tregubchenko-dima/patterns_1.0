package pattern.creational.factory.method;

import pattern.creational.factory.method.logic.AnimalCreator;
import pattern.creational.factory.method.logic.CatCreator;
import pattern.creational.factory.method.logic.DogCreator;
import pattern.creational.factory.method.model.Cat;
import pattern.creational.factory.method.model.Dog;

public class AnimalCreateTest {

    public static void main(String[] args) {
        AnimalCreator<Cat> catCreator = new CatCreator();
        AnimalCreator<Dog> dogCreator = new DogCreator();

        Cat cat = catCreator.createAnimal();
        Dog dog = dogCreator.createAnimal();

        cat.makeSound();
        dog.makeSound();
    }
}
