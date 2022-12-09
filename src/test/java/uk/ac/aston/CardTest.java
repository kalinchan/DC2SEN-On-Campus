package uk.ac.aston;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CardTest {

    ArrayList<Card> cards;

    @Before
    public void setUp() {
        cards = new ArrayList<Card>();
        cards.addAll(generateCards("Spades"));
        cards.addAll(generateCards("Clubs"));
        cards.addAll(generateCards("Diamonds"));
        cards.addAll(generateCards("Hearts"));
    }

    @Test
    public void testSetup() {
    }

    public List<Card> generateCards(String suit) {
        List<Card> c = new ArrayList<Card>();
        for (int i = 1; i < 13; i++) {
            Card card = new Card(getValue(i), suit);
        }
    }

    public String getValue(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return "" + num;
        }
    }
}
