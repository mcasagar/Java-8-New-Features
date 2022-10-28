package com.sb.optionalexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EmployeeService {

	 Map<Integer, Employee> empMap = new HashMap<>();
		
		/*public Employee getEmpById(Integer empId) {
			return empMap.get(empId);
		}*/
	 
	 	public Optional<Employee> getEmpById(Integer empId){
	 		Employee emp = empMap.get(empId);
	 		Optional<Employee> empOptional = Optional.ofNullable(emp);
	 		return empOptional;
	 	}
}
