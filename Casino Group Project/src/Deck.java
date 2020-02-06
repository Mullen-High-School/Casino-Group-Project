import java.util.ArrayList;

public class Deck
	{
		static ArrayList<Cards> deck = new ArrayList<Cards>();
		
				public static void fillDeck()
					{
					deck.add(new Cards("ace", "hearts", 11));
					deck.add(new Cards("ace", "clubs", 11));
					deck.add(new Cards("ace", "spades", 11));
					deck.add(new Cards("ace", "diamonds", 11));
					deck.add(new Cards("king", "hearts", 10));
					deck.add(new Cards("king", "clubs", 10));
					deck.add(new Cards("king", "spades", 10));
					deck.add(new Cards("king", "diamonds", 10));
					deck.add(new Cards("queen", "hearts", 10));
					deck.add(new Cards("queen", "clubs", 10));
					deck.add(new Cards("queen", "spades", 10));
					deck.add(new Cards("queen", "diamonds", 10));
					deck.add(new Cards("jack", "hearts", 10));
					deck.add(new Cards("jack", "clubs", 10));
					deck.add(new Cards("jack", "spades", 10));
					deck.add(new Cards("jack", "diamonds", 10));
					deck.add(new Cards("ten", "hearts", 10));
					deck.add(new Cards("ten", "clubs", 10));
					deck.add(new Cards("ten", "spades", 10));
					deck.add(new Cards("ten", "diamonds", 10));
					deck.add(new Cards("nine", "hearts", 9));
					deck.add(new Cards("nine", "clubs", 9));
					deck.add(new Cards("nine", "spades", 9));
					deck.add(new Cards("nine", "diamonds", 9));
					deck.add(new Cards("eight", "hearts", 8));
					deck.add(new Cards("eight", "clubs", 8));
					deck.add(new Cards("eight", "spades", 8));
					deck.add(new Cards("eight", "diamonds", 8));
					deck.add(new Cards("seven", "hearts", 7));
					deck.add(new Cards("seven", "clubs", 7));
					deck.add(new Cards("seven", "spades", 7));
					deck.add(new Cards("seven", "diamonds", 7));
					deck.add(new Cards("six", "hearts", 6));
					deck.add(new Cards("six", "clubs", 6));
					deck.add(new Cards("six", "spades", 6));
					deck.add(new Cards("six", "diamonds", 6));
					deck.add(new Cards("five", "hearts", 5));
					deck.add(new Cards("five", "clubs", 5));
					deck.add(new Cards("five", "spades", 5));
					deck.add(new Cards("five", "diamonds", 5));
					deck.add(new Cards("four", "hearts", 4));
					deck.add(new Cards("four", "clubs", 4));
					deck.add(new Cards("four", "spades", 4));
					deck.add(new Cards("four", "diamonds", 4));
					deck.add(new Cards("three", "hearts", 3));
					deck.add(new Cards("three", "clubs", 3));
					deck.add(new Cards("three", "spades", 3));
					deck.add(new Cards("three", "diamonds", 3));
					deck.add(new Cards("two", "hearts", 2));
					deck.add(new Cards("two", "clubs", 2));
					deck.add(new Cards("two", "spades", 2));
					deck.add(new Cards("two", "diamonds", 2));
			}
	}
