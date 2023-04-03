package pattern.creational.factory.method.logic;

import pattern.creational.factory.method.model.Cat;

public class CatCreator implements AnimalCreator<Cat>{

    @Override
    public Cat createAnimal() {
        return new Cat();
    }
}
