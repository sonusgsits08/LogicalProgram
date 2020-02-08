package com.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
	List<Integer> output = new ArrayList<Integer>(2);
	output.add(3);
	
	Integer i = output.get(0);
	output.add(0, i);
	System.out.println("output is:"+output);
	int three=3;
	int one=1;
	BigDecimal bg = new BigDecimal(0.3333333);
	bg.setScale(5,RoundingMode.UP);
	
	double toBeTruncated = (double)1/3; //new Double("3.5789055");

	double truncatedDouble = BigDecimal.valueOf(toBeTruncated)
	    .setScale(6, RoundingMode.HALF_UP)
	    .doubleValue();
	
	System.out.print(truncatedDouble);
	int arr [] = {1,2,3};
	
	//System.out.println("%.4d",(1/(double)three));
}
static String formString(List<String> input) {
	String output="";
	for (String element : input) {
		output = output + element.charAt(element.length()-1);
	}
	return output;
}
}
