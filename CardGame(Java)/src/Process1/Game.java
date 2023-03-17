package Process1;

public class Game {

	public static void main(String[] args) {
	    
	    //Create a Deck 
	    Deck d1=new Deck();
	    d1.populate();
	    d1.shuffle();
	   
	    //Create our playing hands
	    Hand h1, h2, h3, dealer;
	    h1=new Hand();
	    h2=new Hand();
	    h3=new Hand();
	    dealer=new Hand();
	    Hand[] hands= {h1,h2,h3};
	    
	    //Deal cards to our hands
	    d1.deal(hands, 2);
	    
	    //Deal 2 cards to dealer
	    d1.deal(dealer, 2);
	    
	    //Show the players' hands
	    for(int i=0;i<hands.length;i++) {
	    	hands[i].flipCards();
	    	System.out.println(hands[i].showHand());
	    }
	    //Flip the dealer's First card
	    dealer.cards.get(0).flipCard();
	    
	    //Show the dealer's cards
	    System.out.println("\nDealer's Cards: \n" + dealer.showHand());

	}

}
