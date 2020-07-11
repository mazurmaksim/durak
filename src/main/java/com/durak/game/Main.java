package com.durak.game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Dealer dlr = new Dealer(deck);
		Player oleg = new Player("Oleg");
		Player maks = new Player("Maks");
//		Player nik = new Player("Nikita");
//		

		dlr.shuffleDeck();
		dlr.dealCards(oleg);
		dlr.dealCards(maks);
		System.out.println(oleg.getName() + " Has this cards ");

		for (Card cr : oleg.getCards(dlr)) {

			System.out.println(cr);

		}

		System.out.println(maks.getName() + " Has this cards ");

		for (Card cr : maks.getCards(dlr)) {

			System.out.println(cr);

		}

//		System.out.println(nik.getName() + " Has this cards ");
//
//		for (Card cr : nik.getCards(dlr)) {
//
//			System.out.println(cr);
//
//		}
//		System.out.println(deck.getDeck().size());
		
		dlr.trumpCard();
		oleg.checkTrump(dlr);
		maks.checkTrump(dlr);
		System.out.println("Козырь "  + dlr.getTrump());
	}

}
