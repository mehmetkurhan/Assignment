package com.CarProject;

public class CarProjectTest {

	public static void main(String[] args) {

				// TODO initiate factory!
				ICarFactory factory = new CarFactory();
				
				ICar car1 = factory.produce("EA100");
				
				System.out.println("Price: " + car1.getPrice());
				System.out.println("Message: " + car1.getMessage(90));
				System.out.println("Fuel Consumption: " + car1.getFuelConsumption(100, 1.2));
				
				car1 = CarDecorator.addAirConditioning(car1);
				System.out.println("Price: " + car1.getPrice()); // Price should increase by 1000 TL

				car1 = CarDecorator.addAutoShift(car1);
				System.out.println("Price: " + car1.getPrice());
			}
	

	}


