import java.util.ArrayList;
import java.util.Collections;

public class prizes
	{
		static ArrayList<prize>prizes= new ArrayList<prize>();
		public static void fillPrizes()
		{
			prizes.add(new prize("Prize 1", 1));
			prizes.add(new prize("Prize 2", 2));
			prizes.add(new prize("Prize 3", 3));
			prizes.add(new prize("Prize 4", 4));
			prizes.add(new prize("Prize 5", 5));
			prizes.add(new prize("Prize 6", 6));
			prizes.add(new prize("Prize 7", 7));
			prizes.add(new prize("Prize 8", 8));
			prizes.add(new prize("Prize 9", 9));
			prizes.add(new prize("Prize 10", 10));
			Collections.shuffle(prizes);
		}
	}
