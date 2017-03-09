package com.CarProject;

//Interface for the car information
public interface ICar {
	
	
    public String getMessage(int velocity);
	
	public int getPrice();
	
	public double getFuelConsumption(int velocity, double time);
	
	public double getEngineVolume();
	
	public int getWeight();
	
	

}
