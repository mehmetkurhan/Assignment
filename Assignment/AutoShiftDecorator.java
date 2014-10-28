package com.CarProject;

public class AutoShiftDecorator extends Decorator {
	
	
	
	public AutoShiftDecorator(ICar _car)
	{
		super(_car);
	}
	
	public int getPrice()
	{
		return car.getPrice() + 2000;
	}
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
