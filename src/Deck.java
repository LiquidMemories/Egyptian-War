import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Nicole Kitson
 * @version Final Project 5, May 2, 2013 
 *  
 **/
public class Deck 
{
	private ArrayList<Card> deck; 

public Deck(){
	deck = new ArrayList<Card>();
}
	
	public void intializeDeck(){
		deck.add(Card.TWO);
		deck.add(Card.TWO);
		deck.add(Card.TWO);
		deck.add(Card.TWO);
		deck.add(Card.THREE);
		deck.add(Card.THREE);
		deck.add(Card.THREE);
		deck.add(Card.THREE);
		deck.add(Card.FOUR);
		deck.add(Card.FOUR);
		deck.add(Card.FOUR);
		deck.add(Card.FOUR);
		deck.add(Card.FIVE);
		deck.add(Card.FIVE);
		deck.add(Card.FIVE);
		deck.add(Card.FIVE);
		deck.add(Card.SIX);
		deck.add(Card.SIX);
		deck.add(Card.SIX);
		deck.add(Card.SIX);
		deck.add(Card.SEVEN);
		deck.add(Card.SEVEN);
		deck.add(Card.SEVEN);
		deck.add(Card.SEVEN);
		deck.add(Card.EIGHT);
		deck.add(Card.EIGHT);
		deck.add(Card.EIGHT);
		deck.add(Card.EIGHT);
		deck.add(Card.NINE);
		deck.add(Card.NINE);
		deck.add(Card.NINE);
		deck.add(Card.NINE);
		deck.add(Card.TEN);
		deck.add(Card.TEN);
		deck.add(Card.TEN);
		deck.add(Card.TEN);
		deck.add(Card.JACK);
		deck.add(Card.JACK);
		deck.add(Card.JACK);
		deck.add(Card.JACK);
		deck.add(Card.QUEEN);
		deck.add(Card.QUEEN);
		deck.add(Card.QUEEN);
		deck.add(Card.QUEEN);
		deck.add(Card.KING);
		deck.add(Card.KING);
		deck.add(Card.KING);
		deck.add(Card.KING);
		deck.add(Card.ACE);
		deck.add(Card.ACE);
		deck.add(Card.ACE);
		deck.add(Card.ACE);
		Collections.shuffle(deck);
	}
	
	public ArrayList<Card> deal(int numOfPlayers){
		ArrayList<Card> playerDeck = new ArrayList<Card>();
		if(numOfPlayers==2){
			int splitCards = 26;
			for(int i=0;i<splitCards;i++){
				int topCard = deck.size()-1;
				playerDeck.add(deck.remove(topCard));
			}
			return playerDeck;
		}
		else if(numOfPlayers==3){
				int splitCards = 17;
				for(int i=0;i<splitCards;i++){
					int topCard = deck.size()-1;
					playerDeck.add(deck.remove(topCard));
				}
			return playerDeck;
		}
		return playerDeck;
	}
	
	
	public void addCard(Card card){
		deck.add(card);
	}
	
	public void removeCard(Card card){
		deck.remove(card);
	}
	
	public Card getCard(int index){
		return deck.get(index);
	}
	
	public int size() {
		return deck.size();
	}
	
	public ArrayList<Card> getDeck(){
		return deck;
	}

	public boolean checkIfFaceCard(Card card){
		boolean faceCardPlayed = false;
		
		if(card==Card.ACE){
			faceCardPlayed=true;
		}
		else if (card==Card.KING){
			faceCardPlayed=true;
		}
		else if (card==Card.QUEEN){
			faceCardPlayed=true;
		}
		else if (card == Card.JACK){
			faceCardPlayed=true;
		}
		return faceCardPlayed;
		
	}
	public void printRules(){
		System.out.println("WELCOME TO EGYPTIAN WAR!!");
		System.out.println();
		System.out.println("RULES OF THE GAME:");
		System.out.println("This game is card game where two");
		System.out.println("players battle with cards until all");
		System.out.println("have been collected by one player. ");
		System.out.println("Only face cards will be able to win ");
		System.out.println("a player cards. When a player turns");
		System.out.println("over a face card, depending on the ");
		System.out.println("face value, the oppistie player will ");
		System.out.println("recieve the following chances to play ");
		System.out.println("another face card.");
		System.out.println();
		System.out.println("JACK = 1 CHANCE");
		System.out.println("QUEEN = 2 CHANCES");
		System.out.println("KING = 3 CHANCES");
		System.out.println("ACE = 4 CHANCES");
		System.out.println();
		System.out.println();
	}

}



