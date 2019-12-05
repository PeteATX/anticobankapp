package com.revature.model;

public class Superallusers {
	private int id;
	private String username;
	private String password;
	private boolean loggedIn;
	
	
	public Superallusers(int id,String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;

	}
	
	public Superallusers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Superallusers ( boolean loggedIn, String username, String password) {
		super();
		this.id = id ;
		this.username = username;
		this.password = password;
		this.loggedIn = loggedIn;
		
	}
	
	public boolean getloggedIn() {
		return loggedIn;
	}
	
	public void setloggedIn(boolean loggedIn) {
		 this.loggedIn = loggedIn;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Superallusers other = (Superallusers) obj;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Superallusers [id=" + id + ", username=" + username + ", password=" + password + ", getId()=" + getId()
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}
