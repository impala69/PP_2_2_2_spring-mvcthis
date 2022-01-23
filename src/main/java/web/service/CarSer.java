package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarSer {
    public static List<Car> getCarsT(Integer count, List<Car> cars) {
        if (count != null) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }

    }
}
