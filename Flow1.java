import java.util.*;
class Flow1{
	public static void main(String [] args){
		Scanner kb = new Scanner (System.in);
		System.out.println("Welcome what can we help you with?");
		System.out.println("1:Create Account");
		System.out.println("2:Change your pass-code");
		System.out.println("3:Transfer airtime");
		
		System.out.println("Please select a valid option");
		int Option;
		Option = kb.nextInt(); 
	
		
		// creating an account 
		if (Option == 1){
			System.out.println("Enter your name");
			String Name = kb.nextLine(); // This line is not running for some reason .
			System.out.println("Enter your email address");
			String Email = kb.nextLine();
			System.out.println("Enter your phone number");
			int PhoneNum = kb.nextInt();
			System.out.println("Enter your one-time pass-code");
			int Passcode = kb.nextInt();
			System.out.println("From Mobfin: Your account has been successfully created");
			
		}
		// password change
		if (Option == 2){
			System.out.println("Enter current Passcode");
			int Pass1 = kb.nextInt();
			System.out.println("Enter new Passcode");
			int Pass2 = kb.nextInt();
			System.out.println("Verify your passcode");
			int Pass3 = kb.nextInt();
			System.out.println("From Mobfin: Your Passcode has been changed successfully");
			
		}
		// airtime recharge
		if (Option == 3){
			System.out.println("Enter a phone number");
			int phoneNumber = kb.nextInt();
			System.out.println("Enter your password");
			int Passcode = kb.nextInt();
			System.out.println("Enter an amount to withdraw");
			int Amount ;
			Amount = kb.nextInt();
			//Generating the ussd code 
			String USSD = "*123*"+phoneNumber+"*"+Amount+"*"+Passcode+"#";
			System.out.println("Your USSD code is" + USSD);
			
			int UserBalance = 15000;
			if (Passcode == 0000){
				System.out.println("correct Password");
			// checking if the amount is less than balance and request is processed.
			if (UserBalance >= Amount){
				System.out.println("Transaction request sent to Mobfin");
				System.out.println("From Mobfin : Your request to withdraw $" +Amount +" is sucessful");
				System.out.println("Thank you for choosing Bridgetel :)");
				}
				// checking if the amount exceeds the balance 
				else if (UserBalance < Amount){
				System.out.println("Insufficient Funds");
			}
			// checking for incorrect password 
			
		}
			else if (Passcode != 0000){
				System.out.println("Incorrect Password");
				}
			
			
			
		}
		
	}
}