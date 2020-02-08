package com.string;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class StringComparision {
public static void main(String[] args) {
StringBuffer sb1 = new StringBuffer("welcome");
StringBuffer sb2 = new StringBuffer("welcome");
System.out.println("sb1 equals sb2 ? :"+sb1.equals(sb2));

Integer a = new Integer(2);
Integer b = new Integer(2);
System.out.println("a equals b? :"+a.equals(b));
System.out.println("a equals b? :"+(a==b));

int ar [][] = new int[3][4];
int size = ar.length;
System.out.println("size"+size);

}
}
