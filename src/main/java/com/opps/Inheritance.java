package com.opps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inheritance {
	public static void main(String[] args) {
							
	//Child c = new Child();
	//Parent p = new Parent();
	Parent p = new Child();
	//Child c = new Parent();
	//System.out.println(""+c.fname+" "+c.surname);
	List list = new ArrayList();
	list.add("1");
	list.add("2");
	list.add(1,"3");
	list.remove(2);
	List linkedList = new LinkedList(list);
	list.addAll(linkedList);
	linkedList = list.subList(0, 3);
	linkedList.clear();
	
	System.out.println("list is:"+list);
	System.out.println("linked list is:"+linkedList);
	}
		
}

class Parent{
	String surname="vishwakarma";
	String fname="siyaram";
}
class Child extends Parent{
	String fname="shivika";	
}