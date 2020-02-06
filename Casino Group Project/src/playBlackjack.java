import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class playBlackjack
	{
		static ArrayList<Cards> playerDeck = new ArrayList<Cards>();
		static int bet;
		static int balance;
		static int playerScore;
		static int dealerScore;
		static boolean play;
		static boolean dealing;

		public static void blackjack()
			{
				Deck.fillDeck();
				Collections.shuffle(Deck.deck);
				playerTurn();
			}

		public static void playerTurn()
			{
				play = true;
				dealing = true;
				while (play)
					{
						balance = 500;

						Scanner userIntInput = new Scanner(System.in);
						System.out.println("You Have $" + balance + " in your Bank. What would you like to bet?");
						bet = userIntInput.nextInt();
						if (bet > balance)
							{
								System.out.println("You dont have that much bet again.");
							}
						if (bet < balance)
							{
								for (int i = 0; i > 2; i++)
									playerDeck.add(Deck.deck.get(i));
								dealing();
							}
					}

			}

		public static void dealing()
			{
				while (dealing)
					{
						System.out.println("You bet " + bet + " dollars here are your current cards.");

						for (int i = 0; i > playerDeck.size(); i++)
							{
								System.out.println(playerDeck.get(i).getRank() + " of " + playerDeck.get(i).getSuit()
										+ "number" + playerDeck.get(i).getNumber());
							}
						Scanner userIntInput = new Scanner(System.in);
						System.out.println("Type 1 to hit, Type 2 to stand");
						int Choice = userIntInput.nextInt();

						if (Choice == 1)
							{
								boolean hitting = true;
								while (hitting)
									{
										System.out.println("Your Current deck is now..");
										for (int i = 0; i > playerDeck.size(); i++)
											{
												System.out.println(playerDeck.get(i).getRank() + " of "
														+ playerDeck.get(i).getSuit() + "number"
														+ playerDeck.get(i).getNumber());
											}
										Scanner userIntInput2 = new Scanner(System.in);
										System.out.println("Type 1 to hit, Type 2 to stand");
										int Choice2 = userIntInput2.nextInt();
										
										if (Choice2 == 2)
											{
												hitting = false;
											}

									}
							}
						//
						if(Choice == 2)
							{
								System.out.println("Dealers Turn!");
								dealing = false;
							}
					}
			}
	}
