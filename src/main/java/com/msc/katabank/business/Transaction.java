package com.msc.katabank.business;

import com.msc.katabank.entity.Account;
import com.msc.katabank.service.TransactionService;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    
    private Date date;
    private Balance balance;
    private Double amount;
    private Account account;

    public Transaction(Account account) {
	this.account = account;
	this.date = new Date();
    }

    public boolean add(double amount) {
	if (getAccount().add(amount)) {
	    this.amount = amount;
	    this.balance = Balance.DEPOSIT;
	    TransactionService.create(this);
	    return true;
	}
	return false;
    }

    public boolean remove(double amount) {
	if (getAccount().remove(amount)) {
	    this.amount = amount;
	    this.balance = Balance.WITHDRAWAL;
	    TransactionService.create(this);
	    return true;
	}
	return false;

    }

    /**
     * @return the date
     */
    public Date getDate() {
	return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
	this.date = date;
    }

    /**
     * @return the balance
     */
    public Balance getBalance() {
	return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(Balance balance) {
	this.balance = balance;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
	return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
	this.amount = amount;
    }

    /**
     * @return the account
     */
    public Account getAccount() {
	return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(Account account) {
	this.account = account;
    }

    
    @Override
    public String toString() {	
	return SDF.format(this.date) +" - "+this.balance.toString() +" => " + this.amount   ;
    }
    
    
}
