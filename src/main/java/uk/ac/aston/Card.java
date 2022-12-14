package uk.ac.aston;


public class Card {
    // The unique identifier of the card and Suit
    private String Value;
    private String Suit;
    private String id;


    public Card(String value, String suit) {
        this.Value = value;
        this.Suit = suit;
        this.id = value + suit;

    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return Value;
    }

    public String getSuit() {
        return Suit;
    }

    @Override
    public String toString() {
        return id;
    }
}