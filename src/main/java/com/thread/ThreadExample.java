package com.thread;

public class ThreadExample implements Runnable{
public static void main(String[] args) {
	try {
	boolean even=true;
	Thread et = new Thread(new EvenThread());
	Thread ot = new Thread(new OddThread());
	et.start();
	ot.start();
	while(even)
		{
			et.wait();
			even=false;
			ot.notify();
		}
	while(!even) {
		ot.wait();
		even = true;
		et.notify();
	}
	}
	catch(Exception e) {
		
	}
//	//ThreadExample te = new ThreadExample();
//	Thread te = new Thread(new ThreadExample());
//	//te.start();
//	te.run();
//	te.run();
//	te.start();		
}
public void run() {
	System.out.println("Play");		
	}
}

class Play implements Runnable{
	public void run() {
	System.out.println("Thread Play");		
	throw new RuntimeException();
	}	
}