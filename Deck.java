import java.util.*;

class Deck {
    private Card[] cards = new Card[52];
    private int nextCard;
    private java.util.Random rand;

    public Deck() {
        for (int a = 0; a < cards.length; a++) {
            cards[a] = new Card(a);
        }
        rand = new Random();
    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(cards), rand);
        nextCard = 0;

    }

    public Card dealCard() {
        if (nextCard < cards.length) {
            return cards[nextCard++];
        } else {
            shuffle();
            return cards[nextCard++];
        }
    }

    public int getCardsRemaining() {
        return (cards.length - nextCard);
    }
}