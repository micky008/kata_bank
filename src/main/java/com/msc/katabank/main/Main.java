package com.msc.katabank.main;

import com.msc.katabank.business.Transaction;
import com.msc.katabank.entity.Account;
import com.msc.katabank.entity.Customer;
import com.msc.katabank.service.CustomerService;
import com.msc.katabank.service.TransactionService;

/**
 *
 * @author micky
 */
public class Main {

    private void createTransaction(Account a, boolean toAdd, double amount) {
	Transaction t = new Transaction(a);
	if (toAdd) {
	    if (t.add(amount)) {
		System.out.println("Depot OK");
	    } else {
		System.out.println("Depot Error");
	    }
	} else {
	    if (t.remove(amount)) {
		System.out.println("Remove OK");
	    } else {
		System.out.println("Remove Error");
	    }
	}
    }

    private void go(String[] args) {
	Customer customer = CustomerService.getCustomerByLoginPassword("email1@email.com", "123456");
	Account account = customer.getAccounts().get(0);
	System.out.println("Account before =>" + account.getAccount());
	createTransaction(account, true, 100);
	System.out.println("Account after =>" + account.getAccount());
	createTransaction(account, false, 200);
	System.out.println("Account after =>" + account.getAccount());
	TransactionService.getAllTransactionByAccount(account).forEach(t -> System.out.println(t));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
	new Main().go(args);
    }

}
