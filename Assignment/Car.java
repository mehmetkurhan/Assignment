package com.CarProject;

public abstract class Car implements ICar {
	
	protected double engineVolume;
	protected int weight;
	protected double fuelConsumptionPer100km;
	protected int price;
	protected int fast;
	protected int normal;
	
	@Override
	public String getMessage(int velocity)
	{
		if(velocity > fast)
		{
			return "Hýzlý";
		}
		else if(velocity >= normal)
		{
			return "Normal";
		}
		else
		{
			return "Yavaþ";
		}
	}
		
	

	@Override
	public int getPrice() {
		
		return price;
	}
	

	@Override
	public double getFuelConsumption(int velocity, double time) {
		
		if(velocity < 0 || time < 0)
		{
			throw new RuntimeException("Values of velocity and/or time cannot be lower than zero.");
		}
		
		double totalDistance = velocity * time;
		double consumptionPerKm = fuelConsumptionPer100km / 100;
		return totalDistance * consumptionPerKm;
	}

	@Override
	public double getEngineVolume() {
		
		return engineVolume;
	}

	
	public int getWeight() {
		
		return weight;
	}
	
	

}
