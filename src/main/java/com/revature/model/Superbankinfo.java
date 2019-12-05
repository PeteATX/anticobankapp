package com.revature.model;

public class Superbankinfo {
    private int acctnum;
    private int balance;
    private String accttype;
    
	public Superbankinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Superbankinfo(int acctnum, int balance, String accttype) {
		super();
		this.acctnum = acctnum;
		this.balance = balance;
		this.accttype = accttype;
	}

	public int getAcctnum() {
		return acctnum;
	}

	public void setAcctnum(int acctnum) {
		this.acctnum = acctnum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccttype() {
		return accttype;
	}

	public void setAccttype(String accttype) {
		this.accttype = accttype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acctnum;
		result = prime * result + ((accttype == null) ? 0 : accttype.hashCode());
		result = prime * result + balance;
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
		Superbankinfo other = (Superbankinfo) obj;
		if (acctnum != other.acctnum)
			return false;
		if (accttype == null) {
			if (other.accttype != null)
				return false;
		} else if (!accttype.equals(other.accttype))
			return false;
		if (balance != other.balance)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Superbankinfo [acctnum=" + acctnum + ", balance=" + balance + ", accttype=" + accttype
				+ ", getAcctnum()=" + getAcctnum() + ", getBalance()=" + getBalance() + ", getAccttype()="
				+ getAccttype() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
    
}
