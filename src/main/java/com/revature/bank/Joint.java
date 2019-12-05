package com.revature.bank;

public class Joint extends Account {
	private static String accountType = "Joint";
	
	 Joint(double initDep) {
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



