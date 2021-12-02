import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Nicole Kitson
 * @version Final Project 5, May 2, 2013 
 *  
 **/
public class Deck 
{	
	ArrayList<Card> deckOfCards;
	
	public Deck() {
		deckOfCards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> addFullDeckOfCards(){
		ArrayList<Card> cardValues = new ArrayList<Card>(Arrays.asList(Card.values()));
		
		for (Card value : cardValues) {
			for(int i=1;i<=4;i++){
				deckOfCards.add(value);
			}
		}
		
		return deckOfCards;
	}
	
	public void shuffleDeck() {
		Collections.shuffle(deckOfCards);
	}
	
	public void addCard(Card card){
		deckOfCards.add(card);
	}
	
	public void removeCard(Card card){
		deckOfCards.remove(card);
	}
	
	public Card getCard(int index){
		return deckOfCards.get(index);
	}
	
	public int getSize() {
		return deckOfCards.size();
	}
	
	public ArrayList<Card> getDeck() {
		return deckOfCards;
	}
	
	public void clear() {
		deckOfCards.clear();
	}
	
	public boolean checkIfFaceCard(Card card) {
		boolean isFaceCard = false;
		
		if(card==Card.ACE) {
			isFaceCard=true;
		}
		else if (card==Card.KING) {
			isFaceCard=true;
		}
		else if (card==Card.QUEEN) {
			isFaceCard=true;
		}
		else if (card == Card.JACK) {
			isFaceCard=true;
		}
		
		return isFaceCard;		
	}
}



