package com.lipika.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapImpl {
	
	public static void main(String[] args) {
		
		Map<Integer,String> employee = new HashMap<Integer,String>();
		employee.put(1, "mac");
		employee.put(2, "kenny");
		employee.put(3, "ames");
		employee.put(4, "gary");
		employee.put(6, "koth");
		employee.put(5, "rock");
		
		System.out.println("Initial Map :" + employee);
				
		//TreeMap sort by key and String implements Comparables hence using a String key to be sorted
		Map<String,Integer> employeeSorted = new TreeMap<String,Integer>();
		employeeSorted.put("mac",1);
		employeeSorted.put("kenny",2);
		employeeSorted.put("gary",3);
		employeeSorted.put("ames",4);
		employeeSorted.put("koth",5);
		employeeSorted.put("rock",6);
		
		System.out.println("Tree Map :" + employeeSorted);
		
		//TreeMap implemantation using Comparables with Integer Key
						
		MapWithComparables m1 = new MapWithComparables("mac", 30);
		MapWithComparables m2 = new MapWithComparables("kenny", 20);
		MapWithComparables m3 = new MapWithComparables("gary", 10);
		MapWithComparables m4 = new MapWithComparables("ames", 10);
		
		
		Map<Integer,MapWithComparables> employeeSortedComp = new TreeMap<Integer,MapWithComparables>(); 
		employeeSortedComp.put(10,m1);
		employeeSortedComp.put(15,m2);
		employeeSortedComp.put(5,m3);
		employeeSortedComp.put(20,m4);
		
		
		for (Entry<Integer,MapWithComparables> entry : employeeSortedComp.entrySet()) {
			System.out.println("Tree Map with Comparables, sorted by the age:" + "key :" + entry.getKey() + ": value :" + entry.getValue());
		}	
		
	}

}
