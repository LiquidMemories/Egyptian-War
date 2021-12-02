import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner in = new Scanner(System.in);
	private static boolean gameover = false;
	private static boolean faceCardPlayed = false;
	private static int playerTurn = 0;
	private static Deck gamePile = new Deck();
	private static Game game;

	public static void main(String[] args) {
		System.out.println(
				"Welcome to Egyptian War!!"
				+ "\n\n"
				+ "How many players will be playing this game? \n");
		
		int numOfPlayers = in.nextInt();
		game = new Game(numOfPlayers);
		
		String playerNames = "";
		for(int i=1;i<= numOfPlayers; i++) {
			playerNames = playerNames + "Player " + i + " ";
		}
		
		System.out.println("Welcome players; " + playerNames + "!\n\n"
				+ "Would you like to hear the rules of the game?");
		
		String response = in.next();
		if(response.equalsIgnoreCase("y")) {
			System.out.println(game.getRules());
		}
		
		
		 while(!game.checkGameOver()) {
			 
		 }
	
		 /* while (!gameover) { while (playerTurn == 0 && playerOne.getChances() > 0) {
		 * System.out.println("Player 1:"); if (faceCardPlayed) {
		 * System.out.print(" You have " + playerOne.getChances() + " chance(s)"); }
		 * System.out.print("Press enter to play a card"); in.nextLine(); Card card =
		 * playerOne.removeTopCard(); gamePile.addCard(card); System.out.println(card
		 * +"\n"); if ((faceCardPlayed = gamePile.checkIfFaceCard(card))){
		 * System.out.println("A face card has been played!"); playerTurn=1; }
		 * playerTwo.setChances(card); playerOne.decreaseChances(); }
		 * 
		 * playerTurn = 1;
		 * 
		 * while (playerTurn == 1 && playerTwo.getChances() > 0) {
		 * System.out.println("Player 2:"); if (faceCardPlayed) {
		 * System.out.print(" You have " + playerTwo.getChances() + " chance(s)"); }
		 * System.out.println("Press enter to play a card"); in.nextLine(); Card card =
		 * playerTwo.removeTopCard(); gamePile.addCard(card); System.out.println(card);
		 * if ((faceCardPlayed = gamePile.checkIfFaceCard(card))) {
		 * System.out.println("A face card has been played!"); playerTurn = 0; }
		 * playerOne.setChances(card); playerTwo.decreaseChances(); } playerTurn = 0; }
		 */
	}
}
