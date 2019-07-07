package blackjack;

import java.util.Scanner;

public class Blackjack {
	
		public static void main(String[] args) {
			
		System.out.println("Welkom bij Blackjack!");
		
		Deck playingDeck = new Deck();
		playingDeck.createFullDeck();
		playingDeck.shuffle();
		
		Deck playerDeck = new Deck();
		
		Deck dealerDeck = new Deck();
		
		double playerMoney = 100.00;
		
		Scanner userInput = new Scanner(System.in);
		
		
		while (playerMoney > 0) {
			System.out.println("Je hebt " + playerMoney + " euro, hoeveel wil je inzetten?");
			double playerBet = userInput.nextDouble();
			if(playerBet > playerMoney){
				System.out.println("Je kunt niet meer inzetten dan je hebt. Verlaat het spel.");
				break;
			}
			
			boolean endRound = false;
			
			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);
			
			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);
			
			while(true) {
				System.out.println("Je hand: ");
				System.out.println(playerDeck.toString());
				System.out.println("Je hand heeft een waarde van: " + playerDeck.cardsValue());
				
				System.out.println("De dealer heeft: " + dealerDeck.getCard(0).toString() + " en [Verborgen kaart].");
				
				System.out.println("Wil je (1)Hitten, (2)Passen of (3)Stoppen?");

				int response = userInput.nextInt();
			
				
				if(response == 1) {
					playerDeck.draw(playingDeck);
					System.out.println("Je hebt een: " + playerDeck.getCard(playerDeck.deckSize()-1).toString() + " getrokken.");
					if(playerDeck.cardsValue() > 21) {
						System.out.println("Oeps! Je waarde is nu: " + playerDeck.cardsValue());
						playerMoney -= playerBet;
						endRound = true;
						break;
					}
				}
				
				if(response == 2) {
					break;
				}
				
				if(response == 3) {
					break;
					
				}
				
			
			System.out.println("Kaarten van de dealer: " + dealerDeck.toString());
			if((dealerDeck.cardsValue() > playerDeck.cardsValue()) && endRound == false);
				System.out.println("De dealer wint!");
				playerMoney -= playerBet;
				endRound = true;	
		}
		
		while ((dealerDeck.cardsValue() < 17) && endRound == false) {
			dealerDeck.draw(playingDeck);
			System.out.println("Dealer heeft " + dealerDeck.getCard(dealerDeck.deckSize()-1).toString() + " getrokken.");
		}
		
		System.out.println("Hand van de dealer heeft waarde van: " + dealerDeck.cardsValue());
		
		if((dealerDeck.cardsValue() > 21) && endRound == false) {
			System.out.println("Dealer heeft verloren! Jij wint! :-) ");
			playerMoney += playerBet;
			endRound = true;
			}
		
		if ((playerDeck.cardsValue() == dealerDeck.cardsValue()) && endRound == false) {
			System.out.println("Jij en de dealer hebben evenveel punten.");
			endRound = true;
		}
			
		if((playerDeck.cardsValue() > dealerDeck.cardsValue()) && endRound == false) {
			System.out.println("Je hebt deze hand gewonnen!");
			playerMoney += playerBet;
			endRound = true;
		}
		else if (endRound == false) {
			System.out.println("Je verliest deze ronde.");
			playerMoney -= playerBet;
			endRound = true;
		}
		
		playerDeck.moveAllToDeck(playingDeck);
		dealerDeck.moveAllToDeck(playingDeck);
		System.out.println("Einde van de ronde.");
		
		}
		
		
		System.out.println("Game over! Je hebt geen geld meer.");
			
		}
		
	}

