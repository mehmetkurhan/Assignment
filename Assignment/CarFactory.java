package com.CarProject;


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
			throw new RuntimeException("There is no such car type.");
			
		}
	}

}
