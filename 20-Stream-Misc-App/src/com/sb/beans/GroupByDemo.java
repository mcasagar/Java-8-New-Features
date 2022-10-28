package com.sb.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {
		List<User> user = new ArrayList<>();
		
		user.add(new User("Ram", 10000, "india"));
		user.add(new User("Anil",20000,"Canada"));
		user.add(new User("Sunil", 30000,"India"));
		user.add(new User("Orlen",40000, "Japan"));
		user.add(new User("Ching Chong",10000,"China"));
		
		Map<String, List<User>> collect = user.stream().collect(Collectors.groupingBy(User::getCountry));
		System.out.println(collect);
	}

}
