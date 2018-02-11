



package com.msc.katabank.dao;

import com.msc.katabank.dao.simul.AccountDAOSimul;
import com.msc.katabank.dao.simul.TransactionDAOSimul;
import com.msc.katabank.dao.simul.CustomerDAOSimul;


public class FactoryDAO {
    
    private static final CustomerDAO CUSTOMER_DAO = new CustomerDAOSimul();
    private static final AccountDAO ACCOUNT_DAO = new AccountDAOSimul();
    private static final TransactionDAO TRANSAC_DAO = new TransactionDAOSimul();
        
	public static CustomerDAO getCustumerDAO() {
	    return CUSTOMER_DAO;
	}
	
	public static AccountDAO getAccountDAO() {
	    return ACCOUNT_DAO;
	}
	
	public static TransactionDAO getTransactionDAO() {
	    return TRANSAC_DAO;
	}
	
	private void FactoryDAO() {
	}
}
