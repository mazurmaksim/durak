package com.durak.game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Dealer dlr = new Dealer(deck);
		Player oleg = new Player("Oleg");
		Player maks = new Player("Maks");
		Player nik = new Player("Nikita");
//		

		dlr.shuffleDeck();
		dlr.dealCards(oleg);
		dlr.dealCards(maks);
		dlr.dealCards(nik);
		
		System.out.println(oleg.getName() + " Has this cards ");

		for (Card cr : oleg.getCards()) {

			System.out.println(cr);

		}

		System.out.println(maks.getName() + " Has this cards ");

		for (Card cr : maks.getCards()) {

			System.out.println(cr);

		}

//		System.out.println(nik.getName() + " Has this cards ");
//
//		for (Card cr : nik.getCards(dlr)) {
//
//			System.out.println(cr);
//
//		}
//		
		dlr.trumpCard();
		System.out.println(oleg.findSmallerTrump(dlr));
		System.out.println(maks.findSmallerTrump(dlr));
//		System.out.println(nik.checkTrump(dlr));
		System.out.println("Козырь "  + dlr.getTrump());
	}

}
