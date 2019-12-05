package com.revature.bank;

public class Customer {
	private String userName;
	private String password;
	private Account account;
	public int knutAcctInfo;

	Customer (String userName, String password, Account account) {
		this.userName = userName;
		this.password = password;
		this.account = account;
	}
	

	Customer (int knutAcctInfo,String userName, String password) {
		this.knutAcctInfo = knutAcctInfo;
		this.userName = userName;
		this.password = password;

	}
	
      @Override
      public String toString() {
    	  return "Knut Info" + 
          "Username" + userName +
    	  "Password" + password +
    	  "Knut Account Number " + 
    	  account;
      }
      
      public String knutAcctInfo() {
    	  return "  Knut Info:" + 
    			  " User Name " + userName + "//" +
    			 " Account Number: " + account.getAcctNum() +
    	         "Balance:" + account.getBalance();
      }
      
      Account getAccount() {
    	  return account;
      }
}
