package com.sb.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(21);
		al.add(32);
		al.add(5);
		al.add(5);

		System.out.println("Element befor sorting :: " + al);

		// #1
		// Collections.sort(al, new ElementsSortingComarator());
		
		//#2
		/*Collections.sort(al, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 > o2) ? 1 : (o2 > o1) ? -1 : 0;
			}
		});*/
		
		//#3
		Collections.sort(al, (o1,  o2)  -> {
				return (o1 > o2) ? 1 : (o2 > o1) ? -1 : 0;
		});
		System.out.println("Elements after sorting :: " + al);

	}
}

//#1
/*//Comprator having a compare method which is used to sort elements
class ElementsSortingComarator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2) {
			return -1;
		}else if(o2 > o1) {
			return 1;
		}else {
			return 0;
		}
		
		return (o1 > o2) ? 1 : (o2 > o1) ?  -1 : 0;
	}
}*/
