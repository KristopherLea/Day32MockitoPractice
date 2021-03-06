package com.exampleDay32.demo.Controller;

import com.exampleDay32.demo.Service.CarService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController {



    CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/beep")
    public String getBeep(){
        return carService.goBeep();
    }

    @GetMapping("/vroom")
    public String getVroom(){
        return carService.goVroom();
    }
}
