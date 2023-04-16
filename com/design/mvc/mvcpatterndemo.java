package com.design.mvc;

public class mvcpatterndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Model = retrieveStudentFromDatabase();
		car carclassmodel = retrievecarFromDatabase();
	}

	private static Student retrieveStudentFromDatabase() {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Robert");
		s.setRollNo("22");
		return s;
		
	
	}
	
	private static car retrievecarFromDatabase() {
		// TODO Auto-generated method stub
		car c =new car();
		c.setName("maruti");
		c.setCarmodel("2009");
		return c;
	
	}

}
