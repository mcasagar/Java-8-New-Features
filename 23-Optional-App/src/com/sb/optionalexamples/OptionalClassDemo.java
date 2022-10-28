package com.sb.optionalexamples;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		//Employee emp = service.getEmpById(101);
		Optional<Employee> empById = service.getEmpById(101);
		
		if(empById.isPresent()) {
			Employee employee = empById.get();
			System.out.println(employee.getName());
		}else {
			System.out.println("With the given ID no record found");
		}
		

	}

}
