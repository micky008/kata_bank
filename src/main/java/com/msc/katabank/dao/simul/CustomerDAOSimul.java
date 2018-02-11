package com.msc.katabank.dao.simul;

import com.msc.katabank.dao.CustomerDAO;
import com.msc.katabank.entity.Account;
import com.msc.katabank.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomerDAOSimul extends DummySimul<Customer> implements CustomerDAO {

    List<Customer> customers = new ArrayList<>(2);

    public CustomerDAOSimul() {
	Customer c1 = new Customer();
	Account a1 = new Account();
	a1.setAccount(2000L);
	a1.setAccountNumber(1);
	a1.setCustomer(c1);
	a1.setRoofDeposit(-1);
	a1.setRoofWhithdrawal(-2200L);
	List<Account> la1 = new ArrayList<>(1);
	la1.add(a1);
	c1.setAccounts(la1);
	c1.setEmail("email1@email.com");
	c1.setFirstName("custo1");
	c1.setIdCustomer(1L);
	c1.setLastName("lnameCusto1");
	c1.setPassword("123456");

	Customer c2 = new Customer();
	Account a2 = new Account();
	a2.setAccount(2000L);
	a2.setAccountNumber(1);
	a2.setCustomer(c2);
	a2.setRoofDeposit(15000L);
	a2.setRoofWhithdrawal(-200L);
	List<Account> la2 = new ArrayList<>(1);
	la2.add(a2);
	c2.setAccounts(la2);
	c2.setEmail("email2@email.com");
	c2.setFirstName("custo2");
	c2.setIdCustomer(2L);
	c2.setLastName("lnameCusto2");
	c2.setPassword("987654");

	customers.add(c1);
	customers.add(c2);

    }

    @Override
    public Customer getCustomerByLoginPassword(String email, String encryptedPassword) {
	Customer custo = null;
	try {
	    custo = this.customers.stream().filter((Customer c) -> c.getEmail().equals(email) && c.getPassword().equals(encryptedPassword)).findFirst().get();
	} catch (NoSuchElementException e) {

	}
	return custo;

    }

}
