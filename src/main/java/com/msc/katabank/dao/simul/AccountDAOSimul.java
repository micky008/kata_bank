package com.msc.katabank.dao.simul;

import com.msc.katabank.dao.AccountDAO;
import com.msc.katabank.entity.Account;
import com.msc.katabank.entity.Customer;
import java.util.List;

public class AccountDAOSimul extends DummySimul<Account> implements AccountDAO {

    @Override
    public List<Account> getAllAccountByCustomer(Customer customer) {
	return null;
    }
}
