package by.epam.task2.observer;

import by.epam.task2.entity.Cone;
import by.epam.task2.exception.CustomException;

public interface Observer {
    void parameterChanged(ConeEvent coneEvent) throws CustomException;
    void updateSurfaceArea(ConeEvent coneEvent) throws CustomException;
    void updateVolume(ConeEvent coneEvent) throws CustomException;
}
