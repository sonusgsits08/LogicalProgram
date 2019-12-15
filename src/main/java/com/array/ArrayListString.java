package com.array;

import java.util.ArrayList;
import java.util.List;
//return a string which is formed by appending last character of each string in ArrayList()
public class ArrayListString {
public static void main(String[] args) {
	List<String> input = new ArrayList<String>();
	input.add("car");
	input.add("java");
	input.add("m");
	String result = formString(input);
	System.out.println("result is:"+result);
}
static String formString(List<String> input) {
	String output="";
	for (String element : input) {
		output = output + element.charAt(element.length()-1);
	}
	return output;
}
}
