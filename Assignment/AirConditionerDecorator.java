package com.CarProject;

//This class adds 1000 to the price of the car
//This class is used in the case that the car has airconditioning added
public class AirConditionerDecorator extends Decorator {
	
	
	
	public AirConditionerDecorator(ICar _car)
	{
		super(_car);

	}
	
	public int getPrice()
	{
		return car.getPrice() + 1000;
		
	}
	
	

}
