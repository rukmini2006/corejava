package com.tutorial.spring.annotation.fourwheel;

import org.springframework.stereotype.Component;

/**
 * @author Jayram
 *
 */
@Component
public class Car {
	public Car(){
		System.out.println("Car.Car()" + this);
	}
}