package com.sb.beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpMinMaxAvgSalary {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Sagar",25,30000));
		list.add(new Employee("Ashok",23,20000));
		list.add(new Employee("Suresh",33,25000));
		list.add(new Employee("Charan",26,40000));
		
		Stream<Employee> stream = list.stream();
		
		//avg salary
		/*double avgSalary = stream.collect(Collectors.averagingInt(emp -> emp.getSal()));
		System.out.println("Emp Avg salary :: " + avgSalary);*/
		
		//minimum salary
		/*Optional<Employee> minEmpSalary = stream.collect(Collectors.minBy(Comparator.comparing(Employee::getSal)));
		System.out.println("Minimum Salary :: "+minEmpSalary.get()); */
		
		//max sal
		Optional<Employee> maxEmpSalary = stream.collect(Collectors.maxBy(Comparator.comparing(Employee::getSal)));
		System.out.println("Minimum Salary :: "+maxEmpSalary.get()); 
	}

}
