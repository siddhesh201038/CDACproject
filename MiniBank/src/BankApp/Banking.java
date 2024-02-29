package BankApp;

import java.util.Scanner;
import java.lang.*;


		class BankAcc{
			 int balance;
			 int prevTransaction;
			  String customerName;
			  long customerAccNo;
			
			
			 BankAcc(String customerName, long customerAccNo) {
				this.customerName = customerName;
				this.customerAccNo = customerAccNo;
			}
			void deposit(int amt) {
				if(amt !=0) {
					balance=balance+amt;
					prevTransaction=amt;
					
				}
			}
		
		
		 void withdraw(int amt) {
			if(amt !=0) {
				balance=balance-amt;
				prevTransaction=-amt;
		}
		}
void getprevTransaction() {
	if(prevTransaction>0) {
		System.out.println("Deposited:"+prevTransaction);
		
	}
	else if(prevTransaction<0) {
		System.out.println("Withdrawn:" +Math.abs(prevTransaction));
		
	}
	else {
		System.out.println("Transaction failed");
	}

}

		void showMenu() {
			char option='\0';
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to CDAC Bank " +customerName);
			System.out.println("Your Account Number:" +customerAccNo);
			System.out.println();
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Previous Transaction");
			System.out.println("5.Exit");
			
			do {
				System.out.println("*****************************");
				System.out.println("Please enter the option Number");
				option=sc.next().charAt(0);
				switch(option) {
				case '1':
					System.out.println("*****************************");
					System.out.println("Your current Balance is "+balance);
					System.out.println("*****************************");
					System.out.println();
					break;
					
				case '2':
					System.out.println("*****************************");
					System.out.println("Enter the Amount to be deposited");
					System.out.println("*****************************");
					int amt=sc.nextInt();
					deposit(amt);
					System.out.println();
					break;
					
				case '3':
					System.out.println("*****************************");
					System.out.println("Enter the Amount to be withdrawn");
					System.out.println("*****************************");
					int amt2=sc.nextInt();
					withdraw(amt2);
					System.out.println();
					break;
					
				case '4':
					System.out.println("*****************************");
					getprevTransaction();
					System.out.println("*****************************");
					System.out.println();
					break;
					
				case '5':
					System.out.println("*****************************");
					break;
					
					default:
						System.out.println("Invalid Option!Please Try Again");
			
				}
			}
				while(option !=  '4');
				
		}
		}
				
				
		class Banking {

				public void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					BankAcc obj=new BankAcc("Mr.Siddhesh Mahadik",230910220);
					obj.showMenu();
					
				}
	

		}
		

