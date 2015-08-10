package com.lipika.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {
	
	public static void main(String[] args) {
		
		Set<String> employee = new HashSet<String>();
		employee.add("glauciana");
		employee.add("Any");
		employee.add("mac");
		employee.add("tommy");
		employee.add("Any");   //duplicate entry
		
		System.out.println("Set elements :" + employee);   // sorted and unique
		
		
		//TreeSet : Ascending order
		Set<String> employeeSrted = new TreeSet<String>();
		employeeSrted.add("glauciana");
		employeeSrted.add("Any");
		employeeSrted.add("mac");
		employeeSrted.add("tommy");
		employeeSrted.add("Any");   //duplicate entry
		
		System.out.println("Tree Set elements :" + employeeSrted);
	}

}


