package com.revature.model;

public class Superacctinfo {
 private int id;
 private int acctnum;
public Superacctinfo() {
	super();
	// TODO Auto-generated constructor stub
}
public Superacctinfo(int id, int acctnum) {
	super();
	this.id = id;
	this.acctnum = acctnum;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAcctnum() {
	return acctnum;
}
public void setAcctnum(int acctnum) {
	this.acctnum = acctnum;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + acctnum;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Superacctinfo other = (Superacctinfo) obj;
	if (acctnum != other.acctnum)
		return false;
	if (id != other.id)
		return false;
	return true;
}
@Override
public String toString() {
	return "Superacctinfo [id=" + id + ", acctnum=" + acctnum + ", getId()=" + getId() + ", getAcctnum()="
			+ getAcctnum() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
			+ super.toString() + "]";
}
 
}
