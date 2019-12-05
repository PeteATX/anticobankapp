package com.revature.bank;

import java.util.Scanner;

import com.revature.model.Superallusers;
import com.revature.service.SuperBankService;

       public class Tester {
    
     public static void createAccount() {
    	 SuperBankService newacct = new SuperBankService();
    	 String userName, password= null;
		  int id = 0;
		  Scanner bankuser = new Scanner(System.in);
		  System.out.println("Input your id");
		  id = bankuser.nextInt();
		  bankuser.nextLine();
		  newacct.setId(id);
		  System.out.println("Input your user name");
		  userName = bankuser.nextLine();
		  sau.setUsername(userName);
		  System.out.println("Input your password");
		  password = bankuser.nextLine();
		  sau.setPassword(password);
		  
		  bankuser.close();
		  
		  Superallusers newUser = new Superallusers(id, userName,password);   // THIS is Where it Connects with JDBC
	        newacct.createUsers(newUser);
     }

	public static void main(String[] args) {
		
		 createAccount();
		  
		  
	}

}
