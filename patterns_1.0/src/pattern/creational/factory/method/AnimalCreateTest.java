package pattern.creational.factory.method;

import pattern.creational.factory.method.logic.AnimalCreator;
import pattern.creational.factory.method.logic.CatCreator;
import pattern.creational.factory.method.logic.DogCreator;
import pattern.creational.factory.method.model.Animal;

public class AnimalCreateTest {

    public static void main(String[] args) {
        AnimalCreator catCreator = new CatCreator();
        AnimalCreator dogCreator = new DogCreator();

        Animal cat = catCreator.createAnimal();
        Animal dog = dogCreator.createAnimal();

        cat.makeSound();
        dog.makeSound();
    }
}
