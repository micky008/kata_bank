package com.msc.katabank.entity;

import java.util.List;


public class Customer {
	private Long idCustomer;
	private String lastName;
	private String firstName;
	private String email;
	private String password;
	private List<Account> accounts  ;

    /**
     * @return the idCustomer
     */
    public Long getIdCustomer() {
	return idCustomer;
    }

    /**
     * @param idCustomer the idCustomer to set
     */
    public void setIdCustomer(Long idCustomer) {
	this.idCustomer = idCustomer;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
	return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
	return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
	this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * @return the accounts
     */
    public List<Account> getAccounts() {
	return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(List<Account> accounts) {
	this.accounts = accounts;
    }
	
	
	
}
