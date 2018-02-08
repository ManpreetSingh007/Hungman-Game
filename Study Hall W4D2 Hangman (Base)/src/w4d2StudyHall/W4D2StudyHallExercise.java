package w4d2StudyHall;

import java.util.Scanner;

public class W4D2StudyHallExercise {
	/* Hungman game
	 * Made by - Lynn and Manpreet */

	private static String usersName;
	private static String inputFromUser;
	private static char menuCharacter;

	public static void main(String args[]) {
		/* Initialize the Text Hangman game */
		
		Scanner keyboard = new Scanner(System.in);
 
	
	

		
		System.out.println("Welcome!");
		
		System.out.println("Please enter your name followed by a return");            /* Welcome the user and request the user to enter a name */
		
		/* Read in the user's name */
		 usersName=keyboard.next();
		 
	while (true) {
			/* Display menu */
			System.out.println(usersName+ ",Please enter a command letter followed by a return");	
			System.out.println(" p -> Play the game");
			System.out.println(" s -> View statistics");
			System.out.println(" q -> Quit");

			
				 
			 inputFromUser =keyboard.next();                       /* Read the menu character */
			 
			
			 if (inputFromUser.equals("p")) {
				 System.out.println("Play the game command recognized ");              /* Play the game? */
			 }
			 
			
			 else if (inputFromUser.equals("s")) {
				 System.out.println(" View the statistics command recognized");         /* View the statistics? */
			 }
			 
			
			 else if (inputFromUser.equals("q")) {
				 System.out.println("Quit the game command recognized");                              /* Quit the game? */
				 System.out.println("Thanks for playing,"+usersName);
			 }
			
			 else {
				 System.out.println("*** Error ***");
				 System.out.println("Invalid menu item entered. It must be p, s, or q!");              /* Display error (if command is none of the above) */
				 System.out.println("The input found was:" +inputFromUser);
			 }
	}
	}
}