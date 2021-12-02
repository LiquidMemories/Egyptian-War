import java.util.ArrayList;
import java.util.Random;

public class Game {
	private Deck gameDeck;
	private ArrayList<Player> players;
	private boolean isGameOver;
	private int currentPlayer;
	
	public Game(int numOfPlayers) {
		isGameOver = false;
		gameDeck = new Deck();
		players = new ArrayList<Player>();
		
		gameDeck.addFullDeckOfCards();
		this.dealCards(numOfPlayers, gameDeck);
		this.determineFirstPlayer();
	}
	
	public String getRules() {
		String rules = 
				"This is a card game where players battle with \n"
				+ "cards until all have been collected by one player. \n"
				+ "Only face cards will be able to win a player cards. \n"
				+ "When a player turns over a face card, depending on the \n" 
				+ "face value, the opposite player will receive the \n"
				+ "following chances to play another face card. \n"
				+ "\n\n"
				+ "Jack = 1 chance \n"
				+ "Queen = 2 chances \n"
				+ "King = 3 chances \n"
				+ "Ace = 4 chances \n"; 
		
		return rules;
	}
	
	private void dealCards(int numOfPlayers, Deck deck) {
		ArrayList<Deck> playerDecks = new ArrayList<Deck>();
		
		for(int i= 0; i<numOfPlayers;i++)
		{
			playerDecks.add(new Deck());
		}
		
		while(deck.getSize() != 0) {
			for(Deck playerDeck: playerDecks) {
				Card card = deck.getCard(deck.getSize()-1);
				
				playerDeck.addCard(card);
				deck.removeCard(card);
			}
		}
		
		for(int i=0; i< numOfPlayers; i++) {
			players.add(new Player(playerDecks.get(0)));
		}
	}
	public void addPlayer(Player player) {
		players.add(player);
	}
	public void removePlayer(Player player) {
		players.remove(player);
	}
	
	public void setPlayerDeck(int player, Deck playerDeck) {
		player = player - 1;
		players.get(player);
	}
	
	public boolean checkGameOver() {
		return isGameOver;
	}

	private void determineFirstPlayer() {
		Random rn = new Random();
		currentPlayer = rn.nextInt(1);
	}
	public int getCurrentPlayer() {
		return currentPlayer;
	}
	
	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
}
