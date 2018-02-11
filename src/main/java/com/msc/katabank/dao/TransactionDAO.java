package com.msc.katabank.dao;

import com.msc.katabank.business.Transaction;
import com.msc.katabank.entity.Account;
import java.util.List;


public interface TransactionDAO extends CRUD<Transaction>{
    List<Transaction> getAllTransactionByAccount(Account account);
}
