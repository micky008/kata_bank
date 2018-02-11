package com.msc.katabank.dao.simul;

import com.msc.katabank.business.Transaction;
import com.msc.katabank.dao.TransactionDAO;
import com.msc.katabank.entity.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionDAOSimul extends DummySimul<Transaction> implements TransactionDAO {

    private final List<Transaction> transactions = new ArrayList<>();

    @Override
    public boolean insert(Transaction t) {
	transactions.add(t);
	return true;
    }
    
    @Override
   public List<Transaction> getAllTransactionByAccount(Account account ) {
       return transactions.stream().filter( t -> t.getAccount().getAccountNumber().longValue() == account.getAccountNumber().longValue() )
	       .collect(Collectors.toList());
   }

}
