package pattern.creational.factory.abstractive.model.electronic;

import pattern.creational.factory.abstractive.model.Watch;

public class ElectronicWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("ElectronicWatch shows time");
    }
}
