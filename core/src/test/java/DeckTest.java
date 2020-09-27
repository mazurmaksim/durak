import com.durak.game.Card;
import com.durak.game.CardsRang;
import com.durak.game.CardsSuit;
import com.durak.game.Deck;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void testDeck(){
        Deck deck = new Deck();
        ArrayList<Card> expected = new ArrayList<Card>();
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.SIX));
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.SEVEN));
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.EIGHT));
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.NINE));
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.TEN));
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.JACK));
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.QUEEN));
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.KING));
        expected.add(new Card( false, CardsSuit.DIAMONDS, CardsRang.ACE));

        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.SIX));
        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.SEVEN));
        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.EIGHT));
        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.NINE));
        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.TEN));
        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.JACK));
        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.QUEEN));
        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.KING));
        expected.add(new Card(false, CardsSuit.HEARTS, CardsRang.ACE));

        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.SIX));
        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.SEVEN));
        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.EIGHT));
        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.NINE));
        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.TEN));
        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.JACK));
        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.QUEEN));
        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.KING));
        expected.add(new Card(false, CardsSuit.SPADES, CardsRang.ACE));

        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.SIX));
        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.SEVEN));
        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.EIGHT));
        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.NINE));
        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.TEN));
        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.JACK));
        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.QUEEN));
        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.KING));
        expected.add(new Card(false, CardsSuit.CLUBS, CardsRang.ACE));

        for(int i = 0;i<expected.size();i++)
           assertEquals("Checking item with index " + i, expected.get(i), deck.getDeck().get(i));
           assertEquals("Checking deck size",deck.getDeck().size(),expected.size());
    }
}