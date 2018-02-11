package com.msc.katabank.business;

/**
 * il faudrait faire des objets separer avec un parent Balance. pour faire full objet.
 * @author micky
 */
public enum Balance {    
            
    WITHDRAWAL("Withdrawal"), DEPOSIT("Deposit");
        
    String str;
    Balance(String str){
	this.str = str;
    }
    
    @Override
    public String toString(){
	return this.str;
    }
    
}
