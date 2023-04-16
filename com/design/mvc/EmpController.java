package com.design.mvc;

public class EmpController {
private Emp model;
private EmpView view;

public EmpController(Emp model,EmpView view)
{
	this.model = model;
	this.view = view;
}
public void setEmpName(String name)
{
 model.setName(name);	
}
public void setEno(String Eno)
{
	model.setEno(Eno);
}

public void getEmpName()
{
	System.out.println(model.getName());
}
public void getEno()
{
	System.out.println(model.getEno());
}

public void updateviewprintDetails()
{
	view.printEmpDetails(model.getName(), model.getEno());
}
}
