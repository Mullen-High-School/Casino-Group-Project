import java.util.Scanner;

public class Roulette
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				welcomePlayer();
				play();
			}
		public static void welcomePlayer()
			{
				System.out.println("Welcome to Roulette!");
				System.out.println("What would you like to do?");
				System.out.println("        1.) Play");
				System.out.println("        2.) How to play");
				
				String play = userStringInput.nextLine();
				
				if (play.equals("1"))
					{
						System.out.println("Lets Play!");
					}
				else if (play.equals("2"))
					{
						System.out.println("This is roulette!");
					}
				else
					{
						welcomePlayer();
					}
			}
		
		public static void play()
			{
				System.out.println("How much would you like to bet?");
				int betAmount = userIntInput.nextInt();
				System.out.println("You bet $" + betAmount);
				
				System.out.println("What color would you like to bet on? Red or Black?");
				String betColor = userStringInput.nextLine().toLowerCase();
				
				if (betColor.equals("red"))
					{
						System.out.println("You bet $" + betAmount + " on Red");
					}
				else
					{
						System.out.println("You bet $" + betAmount + " on Black");
					}
			}
	}
