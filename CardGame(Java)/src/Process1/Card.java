package Process1;

public class Card {
    
	//Private fields
	private Suit suit;
	private Rank rank;
	public boolean isFaceUp;
	
	//Constructor Method
	public Card(Rank rank,Suit suit) {
		this.rank=rank;
		this.suit=suit;
	}
	
	//public Methods
	public String getSuit() {
		return suit.printSuit();
	}
	public int getRank() {
		return rank.getRank();
	}
	
	public String printRank(){
		return rank.printRank();
	}
	public void flipCard() {
		isFaceUp=!isFaceUp;
	}
	public String toString() {
		String str="";
		if(isFaceUp) {
			str+=rank.printRank()+" of "+suit.printSuit();
		}
		else {
			str="Face Down (Nothing to see here...)";
		}
		return str;
	}
}
