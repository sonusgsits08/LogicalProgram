package com.opps;

public class MethodOverloading {
public static void main(String[] args) {
	
	System.out.println("sum result is"+sum(2,3));
}
static int sum(byte a,int b){
	return a+b;
}
static int sum(short a,short b) {
	return a+b;
}
}
