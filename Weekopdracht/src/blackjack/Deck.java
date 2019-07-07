package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	//instance vars
	private ArrayList<Card> cards;
	
	//construct
	public Deck() {
		this.cards = new ArrayList<Card>();
	}
	
	public void createFullDeck() {
		//Generate cards
		
		for(Suit cardSuit : Suit.values()) {
			for(Value cardValue : Value.values()) {
				
				this.cards.add(new Card(cardSuit,cardValue));
				
			}
		}
	}
		
	public void shuffle() {
		ArrayList<Card> tmpDeck = new ArrayList<Card>();
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.cards.size();
		for(int i = 0; i < originalSize; i++) {
			// RandomIndex syntax: rand.nextInt((max-min) + 1) + min;
			randomCardIndex = random.nextInt((this.cards.size() - 1 - 0) + 1) + 0;
			tmpDeck.add(this.cards.get(randomCardIndex));
			
			//remove from original deck:
			this.cards.remove(randomCardIndex);
		}
		
		this.cards = tmpDeck;
	}
	
	public String toString() {
		String cardListOutput = "";
		for(Card aCard : this.cards) {
			cardListOutput += "\n"  + aCard.toString();
		}
		return cardListOutput;
	}
	
	public void removeCard(int i) {
		this.cards.remove(i);
	}
	
	public Card getCard(int i) {
		return this.cards.get(i);
	}
	
	public void addCard(Card addCard) {
		this.cards.add(addCard);
	}
	
	public void draw(Deck comingFrom) {
		this.cards.add(comingFrom.getCard(0));
		comingFrom.removeCard(0);
	}
	
	public int deckSize() {
		return this.cards.size();
	}
	
	public void moveAllToDeck(Deck moveTo) {
		int thisDeckSize = this.cards.size();
		
		
		for (int i = 0; i < thisDeckSize; i++) {
			moveTo.addCard(this.getCard(i));
		}
		
		for (int i = 0; i < thisDeckSize; i++) {
			this.removeCard(0);
		}
	}
	
	public int cardsValue() {
		int totalValue = 0;
		int aces = 0;
		
		for(Card aCard : this.cards) {
			switch(aCard.getValue()) {
			case TWEE: totalValue += 2; break;
			case DRIE: totalValue += 3; break;
			case VIER: totalValue += 4; break;
			case VIJF: totalValue += 5; break;
			case ZES: totalValue += 6; break;
			case ZEVEN: totalValue += 7; break;
			case ACHT: totalValue += 8; break;
			case NEGEN: totalValue += 9; break;
			case TIEN: totalValue += 10; break;
			case BOER: totalValue += 10; break;
			case KONINGIN: totalValue += 10; break;
			case KONING: totalValue += 10; break;
			case AAS: totalValue += 1; break;
			
			}
		}
	
		for(int i = 0; i < aces; i++) {
			
			if(totalValue > 10) {
				totalValue += 1;
			}
			else {
				totalValue += 11;
			}
		}
		
		return totalValue;
	}
}
	
	

