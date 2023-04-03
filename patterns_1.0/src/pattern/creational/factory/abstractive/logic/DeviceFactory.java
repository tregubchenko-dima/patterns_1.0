package pattern.creational.factory.abstractive.logic;

import pattern.creational.factory.abstractive.model.Scale;
import pattern.creational.factory.abstractive.model.Watch;

public interface DeviceFactory {
    Watch createWatch();
    Scale createScale();
}
