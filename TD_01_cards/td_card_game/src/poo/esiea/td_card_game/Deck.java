package poo.esiea.td_card_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<Card> cards;
	private int cardsAvailable;
	private static final int COLOR = 4;
	private static final int RANK = 13;

	public Deck(){
		super();
		this.cards = new ArrayList<Card>();
		Color[] colors = Color.values();
		Rank[] ranks = Rank.values();
		this.cardsAvailable = 52;
		for(int color = 0; color < COLOR; color++) {
			for(int rank = 0; rank < RANK; rank++) {
				Color c = colors[color];
				Rank r = ranks[rank];
				Card card = new Card(c, r);
				this.cards.add(card);
			}
		}
		this.shuffle();
	}

	public void shuffle() {
		System.out.println("Shuffling...");
		if (this.cardsAvailable > 0) {
			Collections.shuffle(this.cards);
		} else {
			System.out.println("Impossible to shuffle, no more cards...");
		}
	}
	
	public int showRemainingCards() {
		return this.cardsAvailable;	
	}
	
	public void draw(int n) {
		System.out.println("Drawing...");
		while (this.cardsAvailable > 0 && n > 0) {
			Card drawedCard = this.cards.get(this.cardsAvailable - 1);
			System.out.println("You drawed: " + drawedCard.getCardString());
			this.cardsAvailable--;
			n--;
		}
		if (this.cardsAvailable == 0) {
			System.out.println("No more cards...\n");
		}
	}

}