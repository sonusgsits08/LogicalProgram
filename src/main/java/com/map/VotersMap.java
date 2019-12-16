package com.map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VotersMap {
public static void main(String[] args) {
	Map<String,String> voters = new HashMap<String, String>();
	voters.put("siyaram", "03/07/1988");
	voters.put("siyaram2", "17/12/2001");
	voters.put("siyaram3", "03/07/2008");
	voters.put("siyaram4", "16/12/2019");
   System.out.println("voters with age > 18 are :"+getEligibleVoters(voters));	
}
static List<String> getEligibleVoters(Map<String,String> inputVoters){
	Set<String> voterKeys = inputVoters.keySet();
	List<String> eligibleVoters = new ArrayList<String>();
	for (Iterator<String> iterator = voterKeys.iterator(); iterator.hasNext();) {
		String voterName = iterator.next();
		String voterDOB = inputVoters.get(voterName);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Date parsedDOB = sdf.parse(voterDOB);
			Date currentDate = new Date();
			Boolean ifgreater = isGreater_Eighteen(parsedDOB,currentDate);
			if(ifgreater) {
				eligibleVoters.add(voterName);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	return eligibleVoters;
}
private static Boolean isGreater_Eighteen(Date parsedDOB, Date currentDate) {
	int yearDOB = parsedDOB.getYear() + 1900 ;
	int monthDOB = parsedDOB.getMonth();
	int dayDOB = parsedDOB.getDay();
	
	int currentYear = currentDate.getYear() + 1900;
	int currentMonth = currentDate.getMonth();
	int currentDay = currentDate.getDay();
	Boolean flag = false;
	int diffYear = currentYear - yearDOB;
	if( diffYear > 18 ) {
		flag = true;
	}
	else if(diffYear == 18 ) {
		if(currentMonth > monthDOB) {
			flag = true;
		}
		else if(currentMonth ==  monthDOB) {
			if(currentDay - dayDOB >= 0 ) {
				flag = true;
			}
		}
	}
	return flag;
}
}
