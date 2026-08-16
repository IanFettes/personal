package slapjack;
import java.util.Random;

public class Card {
	public final String[] suits = {"clubs", "spades", "diamonds", "hearts"};
	public final int[] ranks = new int[13];
	public String randomSuit;
	public int randomRank;
	
	public Card() {		
		// Set up array of ranks
		for (int i = 1; i < ranks.length; i++) {
			ranks[i] = i;
		}
	}
	
	public String getCard() {
		getRandom();
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < ranks.length; j++) {
				if (randomSuit == suits[i] && randomRank == ranks[j]) {
					return "/" + suits[i] + "/" + ranks[j] + ".jpg";
				}
			}
		}
		return "";
	}
	
	private void getRandom() {
		Random rand = new Random();
		
		randomRank = ranks[rand.nextInt(1, 13)];
		randomSuit = suits[rand.nextInt(0,4)];
	}
	
	protected int getRank() {
		return randomRank;
	}
}