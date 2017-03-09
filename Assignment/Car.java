package com.CarProject;

//This class makes decisions of what to output based on information about the car, which is specified in one of the EA classes
public abstract class Car implements ICar {
	
	protected double engineVolume;
	protected int weight;
	protected double fuelConsumptionPer100km;
	protected int price;
	protected int fast;
	protected int normal;
	
	//Returns a string depending on the velocity given
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
		
	
	// Returns the price of the car
	@Override
	public int getPrice() {
		
		return price;
	}
	
	//Returns fuel consumption based on the velocity and time by calculating total distance, and the fuel consumtion per 100 kms
	//for the specified car.
	@Override
	public double getFuelConsumption(int velocity, double time) {
		
		if(velocity < 0 || time < 0)
		{
			throw new RuntimeException("Values of velocity and/or time cannot be lower than zero.");
		}
		
		//Calculates the total distance and consumption per km to get the fuel consumption
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
