package com.lipika.collections;

public class MapWithComparables implements Comparable<MapWithComparables>{
	
	String name;
	int age;
	
	MapWithComparables(String n, int a){
		name=n;
		age=a;
	}
	
	
	@Override
	public int compareTo(MapWithComparables obj){
		return obj.age - obj.age;
	}


	public String toString() {
		return name + " employeeName";
	}
	
		

}