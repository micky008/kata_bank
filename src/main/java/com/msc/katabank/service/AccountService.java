package com.msc.katabank.service;

import com.msc.katabank.dao.FactoryDAO;
import com.msc.katabank.entity.Account;
import com.msc.katabank.entity.Customer;
import java.util.List;

public class AccountService {

    public static List<Account> getAllAccountByCustomer(Customer customer) {
	return FactoryDAO.getAccountDAO().getAllAccountByCustomer(customer);
    }

    public static boolean createAccount(Account account) {
	return FactoryDAO.getAccountDAO().insert(account);
    }
}
