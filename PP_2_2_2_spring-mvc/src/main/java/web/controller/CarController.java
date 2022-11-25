package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarService;
import web.servise.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count",required = false) Long amount, ModelMap model) {
        CarService CS = new CarServiceImpl();
        model.addAttribute("messages", CS.ret(amount));
        return "cars";
    }

}
/*
@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam("count") int id, ModelMap model) {
        List<String> messages = new ArrayList<>();
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("KIA","RIO","RED"));
        listCar.add(new Car("UAZ","PATRIOT","BLACK"));
        listCar.add(new Car("LADA","GRANTA","BLUE"));
        listCar.add(new Car("PORSCHE","911","YELLOW"));
        listCar.add(new Car("AUDI","TT","WHITE"));
        for(Car cars : listCar){
            messages.add(cars.getModel());
        }
        model.addAttribute("messages", listCar);
        return "cars";
    }

}
 */