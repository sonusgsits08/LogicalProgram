package com.thread;

public class ThreadExample implements Runnable{
public static void main(String[] args) {
//	Play p = new Play();
//	p.run();
	
	//ThreadExample te = new ThreadExample();
	Thread te = new Thread(new ThreadExample());
	//te.start();
	te.run();
	te.run();
	te.start();
	
}
public void run() {
	System.out.println("Play");		
	}
}

//class Play implements Runnable{
//	public void run() {
//	System.out.println("Thread Play");		
//	}	
//}