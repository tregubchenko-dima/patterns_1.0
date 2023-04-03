package pattern.creational.factory.abstractive.logic;

import pattern.creational.factory.abstractive.model.Scale;
import pattern.creational.factory.abstractive.model.Watch;
import pattern.creational.factory.abstractive.model.electronic.ElectronicScale;
import pattern.creational.factory.abstractive.model.electronic.ElectronicWatch;

public class ElectronicDeviceFactory implements DeviceFactory{

    @Override
    public Watch createWatch() {
        return new ElectronicWatch();
    }

    @Override
    public Scale createScale() {
        return new ElectronicScale();
    }
}
