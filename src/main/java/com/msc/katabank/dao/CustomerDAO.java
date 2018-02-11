package com.msc.katabank.dao;

import com.msc.katabank.entity.Customer;


public interface CustomerDAO extends CRUD<Customer> {
    Customer getCustomerByLoginPassword(String email, String encryptedPassword);
    
}
