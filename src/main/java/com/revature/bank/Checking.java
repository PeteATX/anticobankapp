package com.revature.bank;

public class Checking extends Account {
	private static String accountType = ("Checking");
  	
    Checking(double initDep) {
    	super();
    	this.setBalance(initDep);
    	
    }
    @Override
    public String toString() {
    	return  accountType +
    	 "Knut Account Number" + this.getAcctNum() +
    	 "Knut Balance" + this.getBalance();
    }
}
