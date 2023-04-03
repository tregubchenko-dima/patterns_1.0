package pattern.creational.factory.abstractive.logic;

import pattern.creational.factory.abstractive.model.Scale;
import pattern.creational.factory.abstractive.model.Watch;
import pattern.creational.factory.abstractive.model.mechanical.MechanicalScale;
import pattern.creational.factory.abstractive.model.mechanical.MechanicalWatch;

public class MechanicalDeviceFactory implements DeviceFactory{
    @Override
    public Watch createWatch() {
        return new MechanicalWatch();
    }

    @Override
    public Scale createScale() {
        return new MechanicalScale();
    }
}
