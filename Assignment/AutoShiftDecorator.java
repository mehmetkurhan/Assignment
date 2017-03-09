package com.CarProject;

//This class adds 2000 to the price and modifies fuel consumption
public class AutoShiftDecorator extends Decorator {
	
	
	
	public AutoShiftDecorator(ICar _car)
	{
		super(_car);
	}
	
	//Changes price of car
	public int getPrice()
	{
		return car.getPrice() + 2000;
	}
	
	//Change the fuel consumption based on the engine volume
	public double getFuelConsumption(int velocity,double time)
	{
		if(car.getEngineVolume() < 2.0)
		{
			return car.getFuelConsumption(velocity, time) * 1.07;
		}
		else
		{
			return car.getFuelConsumption(velocity, time) * 1.05;
		}
	}

}
