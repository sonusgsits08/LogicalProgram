package com.array;

public class StateCapital {
	
	public static void main(String[] args) {
	String [] state_capitals = {"MH_Mumbai","TN_CHENNAi","Karnataka_BNGLR","MP_BHOPAL"};
	String state = "mh";
	System.out.println("capital is:"+getCapital(state_capitals, state));
	}
	
	static String getCapital(String [] state_capitals,String state) {
		String capital="";
		for (String statecapital : state_capitals) {
			if(statecapital.toLowerCase().startsWith(state.toLowerCase())) {
				capital = statecapital.substring(statecapital.indexOf('_')+1, statecapital.length());
			}
		}		
		return capital;
	}
}