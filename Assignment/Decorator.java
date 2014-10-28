package com.CarProject;

public class Decorator extends Car {
	
	ICar car;
	
	public Decorator(ICar _car)
	{
		this.car = _car;
		this.fuelConsumptionPer100km = _car.getFuelConsumption(100, 1);
		this.engineVolume = _car.getEngineVolume();
		this.weight = _car.getWeight();
	}

}
