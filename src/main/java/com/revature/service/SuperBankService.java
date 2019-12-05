package com.revature.service;

import java.util.List;


import com.revature.model.SuperUser;
import com.revature.repository.SuperBankRepository;
import com.revature.repository.SuperBankRepositoryImpl;




public class SuperBankService {
private SuperBankRepository superBankRepository = new SuperBankRepositoryImpl();
	
	public List<SuperUser> getAllSuperUsers(){
		return this.superBankRepository.getAllSuperUsers();
	}
	
	public void createUsers(SuperUser superusers) {
	 this.superBankRepository.createUsers(superusers);
	}

	public Object getRowById(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
