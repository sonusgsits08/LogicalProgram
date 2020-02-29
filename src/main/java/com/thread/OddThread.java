package com.thread;

public class OddThread implements Runnable{

	public void run() {
		for(int i=0;i<10;i++) {
			if(i%2==1) {
				System.out.println("Odd:"+i);
			}
		}		
	}
}
