package com.CarProject;

//This class returns the class corresponding to the string from the CarProjectTest class
public class CarFactory implements ICarFactory {

	@Override
	public ICar produce(String carType) {
		
		if(carType == "EA100")
		{
			return new EA100();
		}
		else if(carType == "EA200")
		{
			return new EA200();
		}
		else if(carType == "EA300")
		{
			return new EA300();
		}
		else
		{
			//if the car type does not exist gives an error
			throw new RuntimeException("There is no such car type."); 
			
		}
	}

}
