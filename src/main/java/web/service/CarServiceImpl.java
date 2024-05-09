package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService {

    private List<Car> carList = new ArrayList<>();

    public CarServiceImpl() {
        carList.add(new Car("Mercedes", "CLA", 2014));
        carList.add(new Car("AUDI", "S7", 2020));
        carList.add(new Car("BMW", "7 series", 2019));
        carList.add(new Car("Reno", "Logan", 2001));
        carList.add(new Car("Pejo", "307", 2005));
    }

    public List<Car> getCarList(int count) {
        if (count >= 5) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }

    public void setCarList(Car car) {
        carList.add(car);
    }

}
