package com.exampleDay32.demo.Mock;

import com.exampleDay32.demo.Service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockCarService {

    @Mock
    CarService carService;

    @Test
    public void test(){
        when(carService.goBeep())
                .thenReturn("beep beep");

        when(carService.goVroom())
                .thenReturn("vroom vroom");


        String expected = "bbep beep";
        String actual = carService.goBeep();

        assertAll("Make car do things",
                () -> assertEquals("beep beep", carService.goBeep()),
                () -> assertEquals("vroom vroom", carService.goVroom())
        );
    }
}
