
public class Cards
	{
		String Rank;
		String Suit;
		int Number;
		

		public Cards(String r, String s, int n)
			{
				Rank = r;
				Suit = s;
				Number = n;
				
			}

		public String getRank()
			{
				return Rank;
			}

		public void setRank(String rank)
			{
				Rank = rank;
			}

		public String getSuit()
			{
				return Suit;
			}

		public void setSuit(String suit)
			{
				Suit = suit;
			}

		public int getNumber()
			{
				return Number;
			}

		public void setNumber(int number)
			{
				Number = number;
			}

		
	}
