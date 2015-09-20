import java.util.Scanner;

public class Game {
	private static Scanner in = new Scanner(System.in);
	private static boolean gameover = false;
	private static boolean faceCardPlayed = false;
	private static int playerTurn = 0;
	private static Deck deck = new Deck();
	private static Player playerOne;
	private static Player playerTwo;

	public static void main(String[] args) {
		initializeGame();
		runGame();

	}

	private static void initializeGame() {
		deck.intializeDeck();
		playerOne = new Player(deck.deal(2));
		playerTwo = new Player(deck.deal(2));
		deck.printRules();
	}

	private static void runGame() {
		while (!gameover) {
			if (playerTurn == 0) {
				System.out.println("Player 1:");
				loopChances(playerOne);
				playerTurn = 1;
			} else {
				System.out.println("Player 2:");
				loopChances(playerTwo);
				playerTurn = 0;
			}
		}
	}

	private static void loopChances(Player player) {
		for (int i = 0; i < player.getChances(); player.decreaseChances()) {
			System.out.println("You have " + player.getChances());
			System.out.println("press enter to play a card");
			in.nextLine();
			Card card = player.removeTopCard();
			System.out.println(card);
			if (faceCardPlayed) {
				System.out.println("A face card has been played!!");
			}
		}
	}
}
