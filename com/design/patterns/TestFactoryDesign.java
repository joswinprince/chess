package com.design.patterns;

public class TestFactoryDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	NotificationFactory nf = new NotificationFactory();
	// get an sms notification
	Notification n1 = nf.createNotification("sms");
	n1.message();
	Notification n2 =nf.createNotification("email");
	n2.message();
	
	CycleFactory cf = new CycleFactory();
	cycle c1 = cf.Createcycle("Avon") ;
	c1.run();
	cycle c2 = cf.Createcycle("Hercules");
	c2.run();
	}

}
