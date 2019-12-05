package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.model.SuperAccount;
import com.revature.model.SuperUser;

import com.revature.util.ConnectionClosers;
import com.revature.util.ConnectionFactory;

public class SuperBankRepositoryImpl implements SuperBankRepository {
	
	
	public List<SuperUser> getAllSuperUsers() {
		
		
		List<SuperUser> superusers = null;

		Connection conn = null;
		/*
		 * I will need a statement if I want to execute a SQL statement.
		 */
		Statement stmt = null;
		/*
		 * I need a result set to hold the records that will be returned.
		 */
		ResultSet set = null;

		final String SQL = "select * from Superuser";

		try {
			conn = ConnectionFactory.getConnection();
			stmt = conn.createStatement();
			set = stmt.executeQuery(SQL);

			superusers = new ArrayList<SuperUser>();

			while (set.next()) {
				superusers.add(
						
						new SuperUser (set.getString(1), set.getString(2)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
			ConnectionClosers.closeResultSet(set);
		}

		return superusers;
	
	


}

	public SuperUser getSuperUserByUsername(String username) {
		SuperUser myUser = null;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet set = null;
		
		final String SQL = "select * from Superuser where username = ?";
		
		try {
			conn = ConnectionFactory.getConnection();
			stmt = conn.prepareStatement(SQL);
			
			stmt.setString(1, username);
			set = stmt.executeQuery();
			
			while(set.next()) {
				
				myUser = new SuperUser(
						set.getString(1),
						set.getString(2)
						);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
			ConnectionClosers.closeResultSet(set);
		}
		return myUser;
	}


	
	
	public void createUsers(SuperUser superusers) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		final String SQL = "insert into SuperUser values(?, ?)";
		
		try {
			conn = ConnectionFactory.getConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, superusers.getUsername());
			stmt.setString(2, superusers.getPassword());
			stmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
		}
	}


	public void deleteSuperUsers(SuperUser superusers) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		final String SQL = "delete from superuser where(?, ?, ?)";
		
		try {
			conn = ConnectionFactory.getConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, superusers.getUsername());
			stmt.setString(2, superusers.getPassword());
			stmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClosers.closeConnection(conn);
			ConnectionClosers.closeStatement(stmt);
		}
		
	}
	



public void updateBalance(String username, double balance) {

    SuperAccount myAccount =null;
    Connection conn = null;
    PreparedStatement stmt = null;


    final String SQL = "UPDATE SuperAccount SET balance = ? ";

    try{


        conn = ConnectionFactory.getConnection();
        stmt = conn.prepareStatement(SQL);
        stmt.setDouble(3, balance);
        
        stmt.execute();

    }catch(SQLException e){
        e.printStackTrace();

    }finally{
        ConnectionClosers.closeConnection(conn);
        ConnectionClosers.closeStatement(stmt);

    }


}



}


