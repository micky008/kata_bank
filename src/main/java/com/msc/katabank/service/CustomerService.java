package com.msc.katabank.service;

import com.msc.katabank.dao.FactoryDAO;
import com.msc.katabank.entity.Customer;

public class CustomerService {

    public static boolean create(Customer customer) {
	return FactoryDAO.getCustumerDAO().insert(customer);
    }
    
    public static Customer getCustomerByLoginPassword(String email, String encryptedPassword){
	return FactoryDAO.getCustumerDAO().getCustomerByLoginPassword(email, encryptedPassword);
    }
    
}
