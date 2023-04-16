package com.design.patterns;

public class NotificationFactory {
public Notification createNotification(String notification)
{
	if (notification == null)
	{
	return null;
	}
	if (notification == "sms")
	{
	return new SmsNotification();	
	}
	if (notification == "email")
	{
	return new EmailNotificaton();	
	}
	if (notification == "call")
	{
	return new callNotification();	
	}
	return null;
}
}
