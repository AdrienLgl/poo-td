package poo.esiea.td_card_game;

public class Card {

	public Rank rank;
	
	public Color color;
	
	public Card(Color color, Rank rank){
		super();
		this.color = color;
		this.rank = rank;
	}
	
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getCardString() {
		return this.getRank().name() + " " + this.getColor().name();
	}



}
