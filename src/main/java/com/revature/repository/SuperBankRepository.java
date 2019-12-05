package com.revature.repository;
import com.revature.model.SuperUser;

import java.util.List;

public interface SuperBankRepository {
	List<SuperUser> getAllSuperUsers();
    SuperUser getSuperUserByUsername(String username);
    void createUsers(SuperUser superusers);
	void updateBalance(String username, double balance);
	void deleteSuperUsers(SuperUser superusers);

}
