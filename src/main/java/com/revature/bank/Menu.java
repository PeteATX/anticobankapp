package com.revature.bank;


import java.util.ArrayList;
import java.util.Scanner;

import com.revature.model.Superallusers;
import com.revature.service.SuperBankService;

public class Menu {
	Scanner keyboard = new Scanner(System.in);
	Bank bank = new Bank() ; // Has List of Customers
    boolean exit;
    
    public static void main(String[] args) {
    	Menu menu = new Menu();
    	menu.runMenu();
    	//Menu menu2 = new Menu();
    	//menu2.runMenu();
    	 
 }
    
    
    public void runMenu() {
    	printHeader();
    	while(!exit) {
   		 printMenu();
   	 	int option = getInput();
   		 menuAction(option);
   		//makeDeposit();
   		//makeWithdrawl();
   		//listAllKnuts();
    	 }
    	    	
    }

    
    public void runMenu2() {
    	printHeader();
    	while(!exit) {
   		 printMenu2();
   	 	int option2 = getInput2();
   		 menuAction2(option2);
   		//makeDeposit();
   		//makeWithdrawl();
   		//listAllKnuts();
    	 }
    	    	
    }
    
	private void menuAction(int option) {
		switch(option) {
		case 0: 
			System.out.println("Thanks for using the Bank of Knuts");
			System.exit(0);
			break;
		case 1: 
			createAccount();
			break;
		case 2:
			makeDeposit();
			 break;
		case 3:
			makeWithdrawl();
			break;
		case 4:
			listKnutBalance();
			break;
		case 5:
			runMenu2();
			break;

		default: 
			System.out.println("Weird Error");
		}
	}
	
	private void menuAction2(int option2) {
		switch(option2) {
		case 0: 
			System.out.println("Thanks for using the Bank of Knuts");
			System.exit(0);
			break;
		case 1: 
			listAllKnuts();
			break;
		default: 
			System.out.println("Weird Error");
		}
	}

   
private void listKnutBalance() {
	   int account = selectAcct();
		if (account >= 0) {
		System.out.println(bank.getCustomer(account).getAccount());
	} else {
		System.out.println("That is not a Valid Knut Account!");
	}
		
	}


private void login(String userName, String passWord) {
    	System.out.println("Please Input Your Username");
    	System.out.println("Please Input Password");
    	System.out.println("Please input your Account Number");
    	//All bank transactions flow from this
    	//Need Validation
    	//After login takes you to your account
    	
   	}

  private void createAccount(int id) {
	  SuperBankService newacct = new SuperBankService();
	  String userName, password, accountType = null;
    	double initialDeposit = 0;
    	boolean valid = false;
    	while(!valid) {
 		System.out.println("Please enter which account you want to open checking or joint");
 		accountType = keyboard.nextLine();
    	if(accountType.equalsIgnoreCase("checking")|| accountType.equalsIgnoreCase("joint")) {
      	 valid = true;
   	}
  	else {
 		System.out.println("Invalid account type selected");
  	}
    }
  	 System.out.println("Please Enter A UserName. 6 Characters");
  	  userName = keyboard.nextLine();
 	 System.out.println("Please Enter A Password. 8 Characters");
	 password = keyboard.nextLine();
	 valid = false;
	 while(!valid) {
		  System.out.println("Please enter an initial deposit: ");
		 try {
			 initialDeposit = Double.parseDouble(keyboard.nextLine());
		 }
		 catch(NumberFormatException e) {
			 System.out.println("Deposit must be a number in Knuts!");
		 }
		 if(accountType.equalsIgnoreCase("checking")) {
			 if(initialDeposit < 1000)  {
				 System.out.println("Checking accounts require at least 1000 knuts");
			 } else {
			 valid = true;
			 }
		 } else if(accountType.equalsIgnoreCase("joint")) {
				 if(initialDeposit < 1000)  {
					 System.out.println("Joint accounts require at least 1000 knuts");
				 } else {
				 valid = true;
				 }
				 

			        Superallusers newUser = new Superallusers(id, userName,password);   // THIS is Where it Connects with JDBC
			        newacct.createUsers(newUser);

		 }
	 }
	 
	 
	 /*
	  * User u = new User(username, password);
		
		SuperBankRepositoryImpl sd = new UserDaoImpl();
		ud.createUser(u);
		
		return u;
	  * 
	  * 
	  */
	 
	 Account account;
	 if(accountType.equalsIgnoreCase("checking")) {
		 account = new Checking(initialDeposit);
	 }else {
		 account = new Joint(initialDeposit);
	 }
  
	 
    Customer customer = new Customer(userName, password, account);
	 bank.addCustomer(customer);
  }

	private int getInput() {
		int option = -1;
		
		do {
			System.out.println("Enter An Option: ");
		  try {
			  option = Integer.parseInt(keyboard.nextLine());
		}
		  
		  
		  catch(NumberFormatException e) {
			  System.out.println("Don't Be Silly! Please Only Input Numbers!");
		  }
		  if (option < 0  || option > 5); 
		// System.out.println("Please Only Choose One of the Options");
	  } while(option < 0 || option > 5);
	  return option;
		
	}
	
	
	private int getInput2() {
		int option2 = -1;
		
		do {
			System.out.println("Enter An Option: ");
		  try {
			  option2 = Integer.parseInt(keyboard.nextLine());
		}
		  
		  
		  catch(NumberFormatException e) {
			  System.out.println("Don't Be Silly! Please Only Input Numbers!");
		  }
		  if (option2 < 0  || option2 > 5); 
		// System.out.println("Please Only Choose One of the Options");
	  } while(option2 < 0 || option2 > 5);
	  return option2;
		
	}
	

	private void printMenu() {
		 System.out.println("Please select an option at the Bank of Knuts");
		  System.out.println("1) Create An Account");
		  System.out.println("2) Make A Deposit");
		  System.out.println("3) Make a Withdrawl");
		  System.out.println("4)List Account Balance");
		  System.out.println("5)Login As Admin");
		  System.out.println("0) Exit");
		  
	}
	
	private void printMenu2() {
		 System.out.println("Admin Select An Option At the Bank of Knuts");
		  System.out.println("1) List All Accounts");
		  System.out.println("0) Exit");
		 	  
	}

	private void printHeader() {
		System.out.println("************************************");
		System.out.println("Welcome To The Mystic Bank of Bnuts ");
		System.out.println("************************************");
	}
	
	private void makeWithdrawl() {
		int account = selectAcct();
		if (account >= 0) {
		System.out.println("How many Knuts Do you Want To Withdraw?");
		double amount = 0;
		try {
			amount = Double.parseDouble(keyboard.nextLine()) -1;
			
		}  catch(NumberFormatException e) {
		   amount = 0;
		}
		bank.getCustomer(account).getAccount().makeWithdrawl(amount);
	}
	}


	private void makeDeposit() {
		int account = selectAcct();
		if (account >= 0) {
		System.out.println("How many Knuts Do you Want To Deposit?");
		double amount = 0;
		try {
			amount = Double.parseDouble(keyboard.nextLine()) -1;
			
		}  catch(NumberFormatException e) {
		   amount = 0;
		}
		bank.getCustomer(account).getAccount().makeDeposit(amount);
	}
	}
	
	private void listAllKnuts() {
		ArrayList<Customer> customers = bank.getCustomers();
	
		   for (int i = 0; i <customers.size(); i++) {
				System.out.println((i +1) + customers.get(i).knutAcctInfo());
		   }
		}

	private int selectAcct() {
		ArrayList<Customer> customers = bank.getCustomers();
		if(customers.size() <= 0) {
			System.out.println("There are no Customers in the bank of Knut");
		return -1;
		}
		System.out.println("Select an account");
		for (int i = 0; i <customers.size(); i++) {
			System.out.println((i +1) + customers.get(i).knutAcctInfo());
		}
		int account = 0;
		System.out.print("Please Enter Your Selection");
       try {
    	   account = Integer.parseInt(keyboard.nextLine()) - 1;
       } catch(NumberFormatException e) {
		account = -1;
	}
       if (account < 0  || account > customers.size()) {
    	   account = -1;
       }
       return account;
	}
}