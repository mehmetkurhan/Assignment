package com.CarProject;

// This is the base class of the program.
// This application takes information from the assigned class which contains information about the car.
// It calculates the price, fuel consumption and the price when adding air conditioning or automatic shift as well 
//a message based on the velocity.
public class CarProjectTest {

	public static void main(String[] args) {

				// TODO initiate factory!
				ICarFactory factory = new CarFactory();
				
				ICar car1 = factory.produce("EA100"); // EA100 is the car we are getting information for
				
		
				//Get these values from the Car class
				System.out.println("Price: " + car1.getPrice());
				System.out.println("Message: " + car1.getMessage(90));
				System.out.println("Fuel Consumption: " + car1.getFuelConsumption(100, 1.2));
				
				//Increase the price by the appropriate amount based on airconditioning and automatic shift
				car1 = CarDecorator.addAirConditioning(car1);
				System.out.println("Price: " + car1.getPrice()); 

				car1 = CarDecorator.addAutoShift(car1);
				System.out.println("Price: " + car1.getPrice());
			}
	

	}


