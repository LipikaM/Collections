package com.lipika.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ListImpl {

	public static void main(String[] args) {
		
		//ArrayList
		List<String> items = new ArrayList<String>();
		//List : write
		items.add("lipika");
		items.add("roxo");
		items.add("max");
		items.add("Anna");
		//items.add(56);  compile time error as list is type casted for only String
		
		//List : Iterate
		for(String str : items){
			System.out.println("ArrayList Items :" + str);
		}
		
		// Linked List
		List<String> linkedItems = new LinkedList<String>();
		
		linkedItems.add(0,"Lipika");
		linkedItems.add(1,"Tom");
		linkedItems.add(2,"terry");
		linkedItems.add(3,"maggie");
		linkedItems.add(4,"ben");
		List<String> linkedItemsCop = new LinkedList<String>(linkedItems);
		System.out.println("Linked before removal :");
		// Linked List remove
		System.out.println(linkedItems);
		for(String itm : linkedItems ){
			if(itm.equals("terry")){
				linkedItemsCop.remove(2);
			}
		}
		System.out.println("Linked after removal :");
		// Linked List read
		Collections.sort(linkedItemsCop);
		System.out.println(linkedItemsCop);
			
		
		List<Integer> employeeNum = new LinkedList<Integer>();
		employeeNum.add(22);
		employeeNum.add(10);
		employeeNum.add(100);
		employeeNum.add(12);
		employeeNum.add(50);
		
		Collections.sort(employeeNum);
		System.out.println(employeeNum);
			
		
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(100);
		arrList.add(20);
		arrList.add(200);
		arrList.add(30);
		
		Collections.sort(arrList);
		System.out.println("Sorted Array List :" + arrList);
		
		//List should be sorted to use binary search
		Integer position = Collections.binarySearch(arrList, 100);
		System.out.println("Binary search outcome :" + position);
			
		
	}
	
		
}
