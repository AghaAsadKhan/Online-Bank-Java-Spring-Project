package com.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

public class SavingAccount {
	
	private long id;
	private int accountNumber;
	private BigDecimal accountBalance;
	private List<SavingTransaction> savingTransactionList;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<SavingTransaction> getSavingTransactionList() {
		return savingTransactionList;
	}
	public void setSavingTransactionList(List<SavingTransaction> savingTransactionList) {
		this.savingTransactionList = savingTransactionList;
	}
	
	

}
