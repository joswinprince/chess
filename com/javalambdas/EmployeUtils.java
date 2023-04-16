package com.javalambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeUtils {
	
public String getFullName(Employee employee)
{
	Function<Employee,String> fullName =null;
	return fullName.apply(employee);
}

public String getManagersLastName(Employee employee)
{
Function<Employee,String> managersLastName = null;
return managersLastName.apply(employee);
}

public boolean hasBeenEmployedLongerThanFiveYears(Employee employee)
{
	Predicate<Employee> employeeLongerThenFive =  null;
	return employeeLongerThenFive.test(employee);
	
}

}
