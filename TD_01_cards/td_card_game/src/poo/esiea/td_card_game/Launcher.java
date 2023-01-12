package poo.esiea.td_card_game;

public class Launcher {
	
	public static void main(String[] args) {
		System.out.println("Launching...");
		Deck deck = new Deck();
		System.out.println("Current available cards: " + deck.showRemainingCards());
		deck.draw(10);
		deck.shuffle();
		System.out.println("Current available cards: " + deck.showRemainingCards());
		deck.draw(50);
		deck.shuffle();
		System.out.println("Current available cards: " + deck.showRemainingCards());
	}


}
