import java.util.ArrayList;
import java.util.Scanner;

public class pinWheelGame
	{
		static Scanner userStringInput = new Scanner(System.in);
		static int playerScore = 0;
		public static void game()
			{
				prizes.fillPrizes();
				intro();
				play();
				
			}
		public static void intro()
		{
			System.out.println("Welcome to my Pinwheel game!");
			System.out.println("Press 1 to view the prizes.");
			System.out.println("Press 2 to continue.");
			String userInput = userStringInput.nextLine();
			if (userInput.equals("1"))
				{
					viewPrizes();
					String name = userStringInput.nextLine();
					intro();
				}
			else if(userInput.equals("2"))
				{
					play();
				}
			else
				{
					System.out.println("INVALID OPTION");
					intro();
				}
		}
		public static void viewPrizes()
		{
			for(prize p: prizes.prizes)
				{
					System.out.println(p.getPrize() + " has a value of " + p.getValue());
				}
		}
		public static void play()
		{
			
		}
	}
