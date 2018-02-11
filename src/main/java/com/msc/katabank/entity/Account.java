package com.msc.katabank.entity;

public class Account {

    private long accountNumber;
    private double account;
    private double roofWhithdrawal;
    private double roofDeposit;
    private Customer customer;

    public boolean add(double amount) {
	if (getRoofDeposit() > -1){
	    if (amount + getAccount() > getRoofDeposit()) {
		return false;
	    }
	}
	setAccount((Double) (getAccount() + amount));
	return true;
    }

    public boolean remove(Double amount) {
	if (getAccount() - amount < getRoofWhithdrawal()) {
	    return false;
	}
	setAccount((Double) (getAccount() - amount));
	return true;
    }

    /**
     * @return the accountNumber
     */
    public Long getAccountNumber() {
	return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
    }

    /**
     * @return the account
     */
    public Double getAccount() {
	return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(double account) {
	this.account = account;
    }

    /**
     * @return the roofWhithdrawal
     */
    public Double getRoofWhithdrawal() {
	return roofWhithdrawal;
    }

    /**
     * @param roofWhithdrawal the roofWhithdrawal to set
     */
    public void setRoofWhithdrawal(double roofWhithdrawal) {
	this.roofWhithdrawal = roofWhithdrawal;
    }

    /**
     * @return the roofDeposit
     */
    public Double getRoofDeposit() {
	return roofDeposit;
    }

    /**
     * @param roofDeposit the roofDeposit to set
     */
    public void setRoofDeposit(double roofDeposit) {
	this.roofDeposit = roofDeposit;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
	return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
	this.customer = customer;
    }

}
