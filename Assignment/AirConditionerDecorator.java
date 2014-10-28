package com.CarProject;

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
