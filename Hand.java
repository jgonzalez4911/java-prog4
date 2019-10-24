import java.util.*;

class Hand {
    ArrayList<Card> cards = new ArrayList<Card>();

    public Hand() {

    }

    @Override
    public String toString() {
        return cards.toString() + " ";
    }

    public int hardValue() {
        int handValue = 0;
        for (int i = 0; i < cards.size(); i++) {
            switch (cards.get(i).getRank()) {
            case 0:
                handValue += 1;
                break;
            case 10:
                handValue += 10;
                break;
            case 11:
                handValue += 10;
                break;
            case 12:
                handValue += 10;
                break;
            default:
                handValue += cards.get(i).getRank() + 1;
                break;
            }
        }
        return handValue;
    }

    public int softValue() {
        int handValue = 0;
        for (int i = 0; i < cards.size(); i++) {
            switch (cards.get(i).getRank()) {
            case 0:
                handValue += 11;
                break;
            case 10:
                handValue += 10;
                break;
            case 11:
                handValue += 10;
                break;
            case 12:
                handValue += 10;
                break;
            default:
                handValue += cards.get(i).getRank() + 1;
                break;
            }
        }
        return handValue;
    }

    public void acceptCard(Card c) {
        if (c != null) {
            cards.add(c);
        } else {
            throw new IllegalArgumentException("Card cannot be null");
        }
    }
}