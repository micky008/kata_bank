package com.msc.katabank.dao;

import com.msc.katabank.entity.Account;
import com.msc.katabank.entity.Customer;
import java.util.List;

public interface AccountDAO extends CRUD<Account> {
    List<Account> getAllAccountByCustomer(Customer customer);
}
