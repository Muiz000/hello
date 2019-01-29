import java.util.*;
class Flow{
	public static void main(String[] args){
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter a phone number");
		String phoneNumber = kb.nextLine();
		System.out.println("Enter your password");
		int Passcode = kb.nextInt();
		System.out.println("Enter an amount to withdraw");
		int Amount ;
		Amount = kb.nextInt();
		//Generating the ussd code 
		String USSD = "*123*"+phoneNumber+"*"+Amount+"*"+Passcode+"#";
		System.out.println("Your USSD code is" + USSD);
		
		int UserBalance = 15000;
		
		//checking if the password is correct or not.
		if (Passcode == 0000){
			System.out.println("Correct Password");
		}
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
			else if (Passcode != 0000){
			System.out.println("Incorrect Password");
			
			}
		
	}
}