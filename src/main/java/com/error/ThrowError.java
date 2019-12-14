package com.error;
public class ThrowError {
	public static void main(String[] args) {
							
		//ThrowError rn = new ThrowError();
		try {
		throwError();
		}
		catch(Error e) {
			System.out.println("Error occured:"+e.getMessage());
		}
	}
	public static void throwError() throws Error{
		throw new Error();
	}

	
}
