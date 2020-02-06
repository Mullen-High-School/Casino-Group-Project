import java.util.Scanner;

public class Number_Guessing{

	static Scanner userStringInput = new Scanner(System.in);
	static int number = (int) (Math.random() * 5) + 1;
	static int tries = 0;
	static Scanner input = new Scanner(System.in);
	static int guess;
	static boolean win = false;
	static boolean again = true;

	public static void playNumberGuessing() {
	greetPlayer();

	while (again == true) {
		generateRandomNumber();
		askForAndEvaluateUserGuess();
		tellNumberOfGuesses();
		askToPlayAgain();
	}
}
	
public static void greetPlayer() {
	System.out.println("Hi! What's your name?");
	String name = userStringInput.nextLine();
	System.out.println("Nice to meet you " + name + "! Lets play a number guessing game!");
}

public static void generateRandomNumber() {
	int number = (int) (Math.random() * 5) + 1;
}

public static void askForAndEvaluateUserGuess() {

	while (win == false) {

		System.out.println("Guess a number between 1 and 5! ");
		guess = input.nextInt();
		tries++;

		if (guess == number) {
			win = true;
		}

		else if (guess < number) {
			System.out.println("Too low, try again");
		}

		else if (guess > number) {
			System.out.println("Too high, try again");
		}

	}
}

public static void tellNumberOfGuesses() {
	System.out.println("You win!");
	System.out.println("It took you " + tries + " tries.");
}

public static void askToPlayAgain() {
	if (win == true) {
		System.out.println("Would you like to play again?");
		String againAnswer = userStringInput.nextLine();
		if (againAnswer.equals("yes") || againAnswer.equals("Yes")) {
			System.out.println("Great!");
			win = false;
		} else if (againAnswer.equals("No") || againAnswer.equals("no")) {
			System.out.println("Ok, thanks for playing! See you next time!");
			again = false;
		}

	}

}



}
	
