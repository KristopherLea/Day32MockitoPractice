package com.exampleDay32.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public String goBeep() {
        return "beep beep";
    }

    @Override
    public String goVroom() {
        return "vroom vroom";
    }
}
