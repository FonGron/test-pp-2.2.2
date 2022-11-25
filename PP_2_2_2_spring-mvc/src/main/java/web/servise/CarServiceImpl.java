package web.servise;

import org.springframework.web.bind.annotation.RequestParam;
import web.controller.CarController;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class CarServiceImpl implements CarService {

    List<Car> listCar = new ArrayList<>();
    {
        listCar.add(new Car("KIA","RIO","RED"));
        listCar.add(new Car("UAZ","PATRIOT","BLACK"));
        listCar.add(new Car("LADA","GRANTA","BLUE"));
        listCar.add(new Car("PORSCHE","911","YELLOW"));
        listCar.add(new Car("AUDI","TT","WHITE"));
    }

    public List<Car> ret(Long amount){
        List<Car> resultList = new ArrayList<>();
        if (amount != null && amount < listCar.size()){
            for (int i = 0;i<amount;i++){
                resultList.add(listCar.get(i));
            }
        } else {
            for(Car car : listCar){
                resultList.add(new Car(car.getBrand(), car.getModel(), car.getColor()));
            }
        }
        return resultList;
    }
}
/*
List<String> list = new ArrayList<>(asList("0","1","2","3","4","5"));
        if(list.subList(0, 5).contains(id)){

        }



        List<Car> resultList = new ArrayList<>();
        for (int i = 0;i<id;i++){
            resultList.add(listCar.get(i));
        }
        System.out.printf(resultList.toString());
        return resultList;


 */