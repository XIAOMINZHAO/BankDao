package BankApplication;

import java.util.Scanner;

public class BankEntrence {

	public static void main(String[] args) {
		
		BankDao bankDao = new BankDao();
				
		int option = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to AAA BankApplication. How can I help? Slecte option from below:");
		System.out.println(" 1 -- Add new user\n "
				+ "2 -- Update user's name\n "
				+ "3 -- update user's email\n "
				+ "4 -- update user's phone number\n "
				+ "5 -- update user's account number\n "
				+ "6 -- display user's info by name\n "
				+ "7 -- deposit\n "
				+ "8 -- display account balance\n "
				+ "9 -- display all users\n "
				+ "10 -- withdraw money\n "
				+ "100 -- exit program");
		
		while(option != 100) { 
			String s = scan.nextLine();
			option = Integer.parseInt(s);
			try {
				switch(option){
				
				case 1: //add new user
					System.out.println("please enter new user's First and Last name");
					String name = scan.nextLine();
					
					
					System.out.println("please enter new user's phone number");
					String phoneNumber = scan.nextLine();
					
					System.out.println("please enter new user's email");
					String email = scan.nextLine();
					
					
					BankAccount a1 = new BankAccount(name, phoneNumber, email, 100.0f);
					bankDao.addCustomer(a1);
					break;
					
					
				case 2: //update user's name
					System.out.println("please enter the name of user that you want to update name");
					String username = scan.nextLine();
					System.out.println("please enter the name you want to update to");
					String newName = scan.nextLine();
					bankDao.updateName(username,newName);
					break;
					
				case 3: //update user's email
					System.out.println("please enter the name of user that you want to update email");
					String username1 = scan.nextLine();
					System.out.println("please enter the email you want to update to");
					String newEmail = scan.nextLine();
					bankDao.updateEmail(username1, newEmail);
					break;
				case 4: //update user's phone number
					System.out.println("please enter the name of user that you want to update phone number");
					String username2 = scan.nextLine();
					System.out.println("please enter the phone number you want to update to");
					String newPhoneNumber = scan.nextLine();
					bankDao.updatePhoneNumber(username2, newPhoneNumber);
					break;
					
				case 5: //update user's account number
					System.out.println("please enter the name of user that you want to update phone number");
					String username3 = scan.nextLine();
					bankDao.updateAccountNumber(username3);
					break;
					
				case 6: //display user's info by name
					System.out.println("please enter the name of user that you want to see info");
					String username4 = scan.nextLine();
					bankDao.getAccount(username4);
					break;
					
				case 7: // deposit
					System.out.println("please enter the username that you want to deposite to ");
					String username5 = scan.nextLine();
					System.out.println("How much do you want to deposit? ");
					int amount = Integer.parseInt(scan.nextLine());
					bankDao.deposit(username5, amount);
					break;
					
				case 8: //display account balance
					System.out.println("please enter the username that you want to check balance");
					String username6 = scan.nextLine();
					bankDao.getBalance(username6);
					break;
					
				case 9: // display all users
					bankDao.getAccount();
					break;
					
				case 10: //withdraw money
					System.out.println("please enter the username that you want to withdraw from");
					String username7 = scan.nextLine();
					System.out.println("How much do you want to withdraw? ");
					int amount1 = Integer.parseInt(scan.nextLine());
					bankDao.withdraw(username7, amount1);
					break;
					
				case 100:
					System.out.println("Thank you for using AAA Application! Goodbye!");
					return;
													
				default:
					
					System.out.println("Cannot process with request.");
					return;
					
					
				
					
				}
				
			} catch (Exception e){
				System.out.println("Cannot recognize username.");
			}
			
		}
		
		

	}

}
