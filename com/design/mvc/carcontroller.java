package com.design.mvc;

public class carcontroller {
public car model;
public carview view;

public carcontroller(car model, carview view) 
{
	this.model = model;
	this.view = view;
}
public void setcarname(String name) {
	model.setName(name);
}
public void setcarModel(String carmodel)
{
	model.setCarmodel(carmodel);
}
public String getcarName()
{
	return model.getName();
}
public String getcarModel()
{
	return model.getCarmodel();
}
}

