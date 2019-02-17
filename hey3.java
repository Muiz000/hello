// Esther :               ; Muiz :                  ; WhoeverElse :  
import java.util.*;
class hey3{
    public static void main (String []  args){
        Scanner kb = new Scanner (System.in);
		Random r = new Random();
		
		System.out.println("		Welcome to ZoMbIE DiCE HAhaHahA ");
		
		System.out.println ("how many players are playing");
		int Players = kb.nextInt();
		int [] NumofPlayers = new int [Players];
		int [] BrainScores = new int [Players];
		String [] PlayerIds = new String [Players];
		
		// creating player names storing them in the array 
		for (int i = 0 ; i < Players ; i++){
			System.out.println("Enter your name player " + (i+1));
			String names = kb.next();
			PlayerIds[i] = names ;
		
		}
		
			
		// Now we want to activate each player to roll a dice .
		int activePlayers = 0 ;
		
		while (activePlayers < Players){
			System.out.println ("1: Roll dice");
			System.out.println ("2: Skip turn");
			System.out.println ("3: Quit game");
			System.out.println();
			System.out.println();
			
			// prompting the user what option they want to select.
			System.out.println("Please select an option HahaHaHa ");
			int UserIn = kb.nextInt();
			
			/**
		* generating random numbers from 0 - 5 since their respective array starts at index zero
		*/
			if (UserIn == 1){
				System.out.printf("Its %s turn \n"   , PlayerIds[activePlayers]);
				int Dice1 = r.nextInt(10-5)+1; 
				int Dice2 = r.nextInt(10-5)+1;
				int Dice3 = r.nextInt(10-5)+1;
				System.out.printf("              Player %s rolled  : ", PlayerIds[activePlayers]);
				
				System.out.print(DiceMethod(1, Dice1)); // rolloing the red dice and showing what side it is on
				System.out.print(DiceMethod(2, Dice2));	// rolloing the yellow dice and showing what side it is on
				System.out.print(DiceMethod(3, Dice3 ));	// rolloing the green dice and showing what side it is on
				System.out.println();
				activePlayers++;
			}
			// setting a condition for active players to continue the game
			if (activePlayers == Players){
				activePlayers = -1; // making the loop start from player 1 
				activePlayers++;
				
			}
			// seting another condition if a player decides to skip a turn
			else if (UserIn == 2){
				PlayerIds[activePlayers] = PlayerIds[activePlayers]  ;
				System.out.printf("Player %s skipped a turn  " , PlayerIds[activePlayers]);
				System.out.println();		
				activePlayers=-1;// THIS LINE IS WORKING BUT ITS NOT SO ACCURATE but we can get away with it :)
				activePlayers = activePlayers + 1;
			}
			//setting another condition if any player decides to quit the game
			else if (UserIn == 3){
				break; // since it doesn't have to be the last man standing .
			}
		}
		
    }
	
	
    public static String DiceMethod(int color, int side){
		Random r = new Random();
		
		// getting the side names and putting them into an array
		 String[] redSides =  {"ShotGuns ", "ShotGun ", "ShotGun ", "FootPrint ", "FootPrint ", "Brain " };
		 String[] yellowSides ={"ShotGun ", "ShotGun ", "FootPrint ", "FootPrint ", "Brain " , "Brain " };
		 String[] greenSides = {"ShotGun ", "FootPrint ", "FootPrint ", "Brain ", "Brain ", "Brain " };
		 
		
		 
		 
		String SideofDice = "";
		if (color == 1){
			SideofDice = redSides[side]; // getting a particular side from the array of the redSides
		}
		else if (color == 2){
			SideofDice = yellowSides[side]; // getting a particular side from the array of the redSides
		}
		else if (color == 3){
			SideofDice = greenSides[side]; // getting a particular side from the array of the redSides
		}
		return SideofDice;
	}
	
	/**
	* All thats left to do is  keeping track of the score and ummmm first player to reACH 13 brains wins i
		guess.
	*/
	
}