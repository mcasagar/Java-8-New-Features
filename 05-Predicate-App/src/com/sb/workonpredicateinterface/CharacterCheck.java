package com.sb.workonpredicateinterface;

import java.util.function.Predicate;

public class CharacterCheck {

	public static void main(String[] args) {
		
		//Requirement : Write a program to check person name is having 7 character or not ?, if having 7 character then return true otherwise return false
		Predicate<String> predicate = (person) -> person.length() == 7;
		System.out.println(predicate.test("Utkarsh"));

	}

}
