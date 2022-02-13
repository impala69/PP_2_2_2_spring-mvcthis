package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

//    public static List<Car> getCarsT(Integer count, List<Car> cars) {
//        if (count ==0 || count>5) {
//            return cars;
//        }
//            return cars.stream().limit(count).collect(Collectors.toList());
//        }
    public List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", 5, 500));
        cars.add(new Car("BMW", 5, 500));
        cars.add(new Car("BMW", 5, 500));
        cars.add(new Car("BMW", 5, 500));
        cars.add(new Car("BMW", 5, 500));

    }

    public List<Car> getCarsT(Integer count) {
        if (count == 0 || count > 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
