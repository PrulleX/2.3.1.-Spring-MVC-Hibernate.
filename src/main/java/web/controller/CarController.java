package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private CarService cars;

    @Autowired
    public void setCars(CarServiceImpl cars) {
        this.cars = cars;
    }

    @GetMapping(value = "/cars")
    public String printCar(Model model, @RequestParam(defaultValue = "3") int count) {

        model.addAttribute("cars", cars.getCarList(count));
        return "cars";
    }
}
