package com.dto;

public class Department {
String dname;
String did;
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDid() {
	return did;
}
public void setDid(String did) {
	this.did = did;
}
@Override
public String toString() {
	return "Department [dname=" + dname + ", did=" + did + "]";
}

}
