package com.hackerrank.beginner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Weird {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(isEven(N));
        scanner.close();
    }
    static boolean isEven(int num){    	
    	if((num%2) == 0 ) {
    		return true;	
    	}
    	else {
    		return false;	
    	}
    	
    }
}
