package web.servise;

import web.controller.CarController;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> ret(Long amount);
}
