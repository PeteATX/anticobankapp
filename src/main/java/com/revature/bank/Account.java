
package com.revature.bank;

public class Account {
     public double knutBalance;
     private int acctNum;
     private static int numOfAccts = 567868;
     
     public Account() {
    	 acctNum= numOfAccts++;
     }
     
	public double getBalance() {
		return knutBalance;
	}
	public void setBalance(double knutBalance) {
		this.knutBalance = knutBalance;
	}
	public int getAcctNum() {
		return acctNum;
	}
	    
	public void makeWithdrawl(double amount) {
		if (amount > knutBalance) {
			System.out.println("You don't have enough Knuts!");
		   return;
		} 
		 knutBalance = knutBalance - amount;
		 System.out.println("You have withdrawn" +" " + amount + " knuts");
		 System.out.println("You now have a balance of" + knutBalance + "knuts");
	}
	
	public void makeDeposit(double amount)  {
		if (amount < 0) {
			System.out.println("There are no negative Knuts");
		    return;
		}
	
		   knutBalance += amount;
		   System.out.println("You have added " + amount + " knuts");
		   System.out.println("You now have a balance of " + knutBalance);
	}
	
     
}
