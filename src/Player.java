import java.util.ArrayList;

public class Player {
	private ArrayList<Card> playersDeck;
	private int chances = 1;

	public Player(ArrayList<Card> splitDeck) {
		playersDeck = splitDeck;
	}

	public int getDeckSize() {
		return playersDeck.size();
	}

	public void addCard(Card card) {
		playersDeck.add(card);
	}

	public Card removeTopCard() {
		int topCardIndex = playersDeck.size() - 1;
		Card card = playersDeck.get(topCardIndex);
		playersDeck.remove(topCardIndex);
		return card;
	}

	public void takePile(Deck pile) {
		for (int i = 0; i < pile.size();) {
			int topCard = pile.size() - 1;
			Card card = pile.getCard(topCard);
			pile.removeCard(card);
			playersDeck.add(card);
		}
	}

	public void setChances(Card card) {
		switch (card) {
		case JACK:
			chances = 1;
			break;
		case QUEEN:
			chances = 2;
			break;
		case KING:
			chances = 3;
			break;
		case ACE:
			chances = 4;
			break;
		default:
			chances = 1;
			break;
		}
	}

	public int getChances() {
		return chances;
	}
	public void decreaseChances(){
		 chances--;
	}
	public void increaseChances(){
		chances++;
	}

	public int getSize() {
		return playersDeck.size();
	}

	public boolean checkWin() {
		boolean gameover = false;

		if (playersDeck.size() == 0) {
			gameover = true;
		}
		return gameover;
	}

}
