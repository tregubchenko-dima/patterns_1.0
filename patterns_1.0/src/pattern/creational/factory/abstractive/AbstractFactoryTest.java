package pattern.creational.factory.abstractive;

import pattern.creational.factory.abstractive.logic.DeviceFactory;
import pattern.creational.factory.abstractive.logic.ElectronicDeviceFactory;
import pattern.creational.factory.abstractive.logic.MechanicalDeviceFactory;
import pattern.creational.factory.abstractive.model.Scale;
import pattern.creational.factory.abstractive.model.Watch;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        DeviceFactory mDeviceFactory = new MechanicalDeviceFactory();
        DeviceFactory eDeviceFactory = new ElectronicDeviceFactory();

        Watch mWatch = mDeviceFactory.createWatch();
        Scale mScale = mDeviceFactory.createScale();
        Watch eWatch = eDeviceFactory.createWatch();
        Scale eScale = eDeviceFactory.createScale();

        mWatch.showTime();
        mScale.showWeight(10);
        eWatch.showTime();
        eScale.showWeight(10);
    }
}
