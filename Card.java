import java.util.ArrayList;

public class Card {
    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;
    public static final int ACE = 0;
    public static final int TWO = 1;
    public static final int THREE = 2;
    public static final int FOUR = 3;
    public static final int FIVE = 4;
    public static final int SIX = 5;
    public static final int SEVEN = 6;
    public static final int EIGHT = 7;
    public static final int NINE = 8;
    public static final int TEN = 9;
    public static final int JACK = 10;
    public static final int QUEEN = 11;
    public static final int KING = 12;
    private int cardNumber;
    private static String[] rankName = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    private static String[] suitName = { "S", "H", "C", "D" };

    public Card(int n) {
        cardNumber = n;
    }

    public int getRank() {
        return (this.cardNumber % 13);
    }

    public int getSuit() {
        return cardNumber / 13;
    }

    public String getRankName() {
        return rankName[getRank()];

    }

    public String getSuitName() {
        return suitName[getSuit()];
    }

    @Override
    public String toString() {
        return (getRankName() + getSuitName());
    }

    @Override
    public boolean equals(Object card) {
        if (card instanceof Card && ((Card) card).cardNumber == cardNumber) {
            return true;
        } else {
            return false;
        }
    }

}