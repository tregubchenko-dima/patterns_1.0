package pattern.creational.factory.method.logic;

import pattern.creational.factory.method.model.Animal;
import pattern.creational.factory.method.model.Cat;

public class CatCreator implements AnimalCreator{

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
