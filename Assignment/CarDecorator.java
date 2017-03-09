package com.CarProject;

//This class returns the decorator objects for air conditioning and automatic shift
public class CarDecorator {
	/**
	 * Adds air conditioning to a given car
	 * 
	 * @param car car to be modified
	 * @return modified car
	 */
	public static ICar addAirConditioning(ICar car){
		
		return new AirConditionerDecorator(car);
	}
	
	/**
	 * Adds auto shift to a given car
	 * 
	 * @param car to be modified
	 * @return modified car
	 */
	public static ICar addAutoShift(ICar car){
		
		return new AutoShiftDecorator(car);
	}
	
	/**
	 * Adds airbag to a given car
	 * 
	 * @param car to be modified
	 * @param type must be 2, 4 and 8
	 * @return modified car
	 */
	public static ICar addAirbag(ICar car, int type){
		// TODO implement
		return new AirBagDecorator(car,type);
	}
	

}
