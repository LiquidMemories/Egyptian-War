import java.util.Scanner;

public class EgyptianWarTester {
	private static Scanner in = new Scanner(System.in);
	private static boolean gameover = false;
	private static boolean faceCardPlayed = false;
	private static int playerTurn = 0;
	private static Deck deck = new Deck();
	private static Player playerOne;
	private static Player playerTwo;

	public static void main(String[] args) {
		deck.intializeDeck();
		System.out.println(deck.size());
		playerOne = new Player(deck.deal(2));
		playerTwo = new Player(deck.deal(2));
		System.out
				.println("Player1 has: " + playerOne.getDeckSize() + "cards.");
		System.out
				.println("Player2 has: " + playerTwo.getDeckSize() + "cards.");
		deck.printRules();
		while (!gameover) {
			while (playerTurn == 0 && playerOne.getChances() > 0) {
				System.out.println("Player 1:");
				if (faceCardPlayed) {
					System.out.print(" You have " + playerOne.getChances()
							+ " chance(s)");
				}
				System.out.print("Press enter to play a card");
				in.nextLine();
				Card card = playerOne.removeTopCard();
				deck.addCard(card);
				System.out.println(card +"\n");
				if ((faceCardPlayed = deck.checkIfFaceCard(card))){
					System.out.println("A face card has been played!");
					playerTurn=1;
				}
				playerTwo.setChances(card);
				playerOne.decreaseChances();
			}
			playerTurn = 1;

			while (playerTurn == 1 && playerTwo.getChances() > 0) {
				System.out.println("Player 2:");
				if (faceCardPlayed) {
					System.out.print(" You have " + playerTwo.getChances()
							+ " chance(s)");
				}
				System.out.println("Press enter to play a card");
				in.nextLine();
				Card card = playerTwo.removeTopCard();
				deck.addCard(card);
				System.out.println(card);
				if ((faceCardPlayed = deck.checkIfFaceCard(card))) {
					System.out.println("A face card has been played!");
					playerTurn = 0;
				}
				playerOne.setChances(card);
				playerTwo.decreaseChances();
			}
			playerTurn = 0;
		}
	}
}
