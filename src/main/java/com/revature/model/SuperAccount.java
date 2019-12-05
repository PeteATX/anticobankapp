package com.revature.model;

public class SuperAccount {
  private String username;
  private int acct_id;
  private double balance;
  
public SuperAccount() {
	super();
	// TODO Auto-generated constructor stub
}
public SuperAccount(String username, int acct_id, double balance) {
	super();
	this.username = username;
	this.acct_id = acct_id;
	this.balance = balance;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getAcct_id() {
	return acct_id;
}
public void setAcct_id(int acct_id) {
	this.acct_id = acct_id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "SuperAccount [username=" + username + ", acct_id=" + acct_id + ", balance=" + balance + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + acct_id;
	long temp;
	temp = Double.doubleToLongBits(balance);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((username == null) ? 0 : username.hashCode());
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
	SuperAccount other = (SuperAccount) obj;
	if (acct_id != other.acct_id)
		return false;
	if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}
  
}
