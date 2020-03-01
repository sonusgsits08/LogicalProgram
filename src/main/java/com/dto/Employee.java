package com.dto;

public class Employee {
String ename;
int eage;
int salary;
Department department;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEage() {
	return eage;
}
public void setEage(int eage) {
	this.eage = eage;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", eage=" + eage + ", salary=" + salary + ", department=" + department + "]";
}
}
