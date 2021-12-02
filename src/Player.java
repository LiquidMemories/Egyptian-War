public class Player {
	private Deck playersDeck;
	private int chances = 1;

	public Player(Deck deckOfCards) {
		playersDeck = deckOfCards;
	}

	public int getDeckSize() {
		return playersDeck.getSize();
	}

	public void addCard(Card card) {
		playersDeck.addCard(card);
	}

	public Card removeTopCard() {
		int topCardIndex = playersDeck.getSize() - 1;
		Card card = playersDeck.getCard(topCardIndex);
		playersDeck.removeCard(card);
		return card;
	}

	public void takePile(Deck pile) {
		for (int i = 0; i < pile.getSize();) {
			int topCard = pile.getSize() - 1;
			Card card = pile.getCard(topCard);
			pile.removeCard(card);
			playersDeck.addCard(card);
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
		return playersDeck.getSize();
	}

	public boolean checkWin() {
		boolean gameover = false;

		if (playersDeck.getSize() == 0) {
			gameover = true;
		}
		return gameover;
	}

}
