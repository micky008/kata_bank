package com.msc.katabank.service;

import com.msc.katabank.business.Transaction;
import com.msc.katabank.dao.FactoryDAO;
import com.msc.katabank.entity.Account;
import java.util.List;

public class TransactionService {

    public static boolean create(Transaction transcation) {
	return FactoryDAO.getTransactionDAO().insert(transcation);
    }

    public static List<Transaction> getAllTransactionByAccount(Account account) {
	return FactoryDAO.getTransactionDAO().getAllTransactionByAccount(account);
    }
}
