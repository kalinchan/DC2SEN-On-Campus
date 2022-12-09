package uk.ac.aston;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // A list of cards in the deck
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        cards.add(new Card("Ace", "Hearts"));
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void viewCards() {
        for (Card card : cards) {
            System.out.println(card.getId());
        }
    }
}