package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
//return list of students with marks above average.
public class StudentMarks {
public static void main(String[] args) {
	Map<String,Integer> students = new HashMap<String, Integer>();
	students.put("Siyaram", 40);
	students.put("sonu", 60);
	students.put("Sunil", 30);
	students.put("Swapnil", 70);
	students.put("Shubham", 20);
		
	System.out.println("Students with marks above average are: "+getStudents(students));
}
static List<String> getStudents(Map<String,Integer> students) {
	Integer average=0;
	Integer  sum=0;
	Integer count=0;
	Iterator<Integer> studentIterator = students.values().iterator();
	while (studentIterator.hasNext()) {
		Integer object =  studentIterator.next();
		sum = sum + object;
		count++;
	}	
	List<String> studentQualified = new ArrayList<String>();
	
	average = sum/(count);
	Set<String> keys = students.keySet();
	for (Iterator iterator = keys.iterator(); iterator.hasNext();) {		
		String string = (String) iterator.next();
		Integer  iMark= students.get(string);
		if(iMark > average) {
			studentQualified.add(string);
		}		
	}
	System.out.println("Average marks:"+average);
	return studentQualified;
}
}