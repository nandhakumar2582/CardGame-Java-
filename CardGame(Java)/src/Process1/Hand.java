package Process1;

import java.util.*;

public class Hand {
     protected ArrayList<Card> cards;
     public Hand() {
    	 cards=new ArrayList<Card>();
     }
     public void clear() {
    	 cards.clear();
     }
     public void add(Card card) {
    	 cards.add(card);
     }
     public String showHand() {
    	 /*Show Cards and their totals points, but 
    	  * only show total points if All cards are face up */
    	 String str="";
    	 boolean allFaceUp=true;
    	 for(Card c:cards) {
    		 str+=c.toString() + "\n";
    		 if(!c.isFaceUp) {
    			 allFaceUp=false;
    		 }
    	 }
    	 //If all cards are face up, show total
    	 if(allFaceUp) {
    		 str+="Total Points = "+getTotal()+"\n";
    	 }
    	 return str;
     }
     public void flipCards() {
    	 for(Card c:cards) {
    		 c.flipCard();
    	 }
     }
     public boolean give(Card card,Hand otherHand) {
    	 if(!cards.contains(card)) {
    		 return false;
    	 }
    	 else {
    		//get index position of card
    		 cards.remove(card); 
    		 otherHand.add(card);
    		 return true;
    		 
    	 }
     }
     //Return the total points of a hand
     public int getTotal() {
    	 int totalPts=0;
    	 boolean hasAce=false;
    	 //Getting total points(any Aces by default as 1)
    	 for(int i=0;i<cards.size();i++) {
    		 totalPts+=cards.get(i).getRank();
    		 if(cards.get(i).printRank()=="Ace") {
    			 hasAce=true;
    		 }
    		 //Make Ace worth 11 if total points <= 11
    		 if(hasAce&&totalPts<=11) {
    			 totalPts+=10;
    		 } 
    	 }
    	 return totalPts;
     }
     public String toString() {
    	 String str="";
    	 for(Card card:cards) {
    		 str+=card.toString()+"\n";
    	 }
    	 return str;
     }
     
}
