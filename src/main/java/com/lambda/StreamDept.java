package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.dto.Department;
import com.dto.Employee;

public class StreamDept {
	public static void main(String[] args) {
	List<Employee> elist = new ArrayList();
	for(int i=0;i<10;i++) {
		Employee e = new Employee();
		e.setEname("Siyaram"+i);
		e.setEage(i);
		e.setSalary(i*i);
		Department d = new Department();
		if(i%2==0) {		
			d.setDid("D0");
		}
		else {
			d.setDid("D1");
		}
		d.setDname("IT"+i);
		e.setDepartment(d);
		elist.add(e);
	}	
	//get departments for each employee..
	List<Department> dlist = elist.stream().map(a->a.getDepartment()).collect(Collectors.toList());
	
	// get highest salary in each department
	
	System.out.println(dlist);
	}
}
