package BankApplication;

import java.util.List;
import java.util.Set;

public interface BankDaoInterface {
	
	public void addCustomer(BankAccount a);
	public void updateName(String username, String newName);
	public void updateEmail(String username, String email);
	public void updatePhoneNumber(String username, String phoneNumber);
	public Set<String> getAccount();
	public void getAccount(String name);
	public void deposit(String username, int amount);
	public void withdraw(String username, int amount);
	public void getBalance(String name);
	public void deleteUser(Long accountnumber);
	
	
	

}
