package BankApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BankDao implements BankDaoInterface{
	List <BankAccount> customers;
	HashMap<String, BankAccount> customerMap
    = new HashMap<String, BankAccount>();
	
	public BankDao() {

		customerMap = new HashMap<String, BankAccount>();
		
			
	}
	
	public void addCustomer(BankAccount a) {
		customerMap.put(a.getCustomerName(), a);
		
	}
	
	public void updateName(String username, String newName) {
		
		
		BankAccount a = customerMap.get(username);
		
		a.setCustomerName(newName);
		customerMap.remove(username);
		customerMap.put(newName,a);
		
		
	}
	
	public void updateEmail(String username, String newEmail) {
		BankAccount a = customerMap.get(username);
		
		a.setEmail(newEmail);
		
	}
	
	public void updatePhoneNumber(String username, String newPhoneNumber) {
		BankAccount a = customerMap.get(username);
		
		a.setPhoneNumber(newPhoneNumber);
		
	}
	
	public void updateAccountNumber(String username) {
		BankAccount a = customerMap.get(username);
		a.setAccountNumber();
		
	}
	
	public Set<String> getAccount() {
		System.out.println(customerMap.keySet());
		return customerMap.keySet();
	
	}
	public void getAccount(String name) {
		BankAccount a = customerMap.get(name);
		a.getAccountNumber();
		a.getBalance();
		a.getCustomerName();
		a.getEmail();
		a.getPhoneNumber();
		
		
		
	}
	
	public void deposit(String username, int amount) {
		if(amount < 5 || amount > 10000) {
			System.out.println("insufficient deposit amount");
		}
		else {
			BankAccount a = customerMap.get(username);
			a.deposite(amount);
		}
		
		
		
	}
	
	public void getBalance(String username) {
		BankAccount a = customerMap.get(username);
		a.getBalance();
	}

	@Override
	public void withdraw(String username, int amount) {
		BankAccount a = customerMap.get(username);
		a.withdraw(amount);
		
	}

	@Override
	public void deleteUser(Long accountnumber) {
		
		// TODO Auto-generated method stub
		
		for(BankAccount b : customerMap.values()) {
			if(b.getAccountNumber() == accountnumber ) {
				customerMap.remove(b.getCustomerName());
			}
		}
		
		System.out.println("The account of " + accountnumber + " has been deleted.");
		
	}



}
