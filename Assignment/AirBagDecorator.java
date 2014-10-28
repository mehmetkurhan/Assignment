package com.CarProject;

public class AirBagDecorator extends Decorator {
	
	
	int type;
	
	public AirBagDecorator(ICar _car,int _type)
	{
		super(_car);
		this.type = _type;
		
	}
	
	public int getPrice() 
	{
		if(type == 2)
		{
			return car.getPrice() + 500;
		}
		else if(type == 4)
		{
			return car.getPrice() + 1000;
		}
		else if(type == 8)
		{
			return car.getPrice() + 1500;
		}
		else
		{
			
			 throw new RuntimeException("There is no such airbag type.");
		}
	}
	

}
