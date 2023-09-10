import java.lang.reflect.Array;
import java.util.ArrayList;

public class DeckOfCards {
    //enum function do not have a public constructor
    public enum Suit {
        Club (0), Diamond (1), Heart(2), Spade(3);
        private int value;

        Suit(int v) {
            value = v;
        }
        public int getValue() {
            return value;
        }
        public Suit getSuitFromValue(int value) {
            for (Suit suit : Suit.values()) {
                if (suit.getValue() == value) {
                    return suit;
                }
            }
            throw new IllegalArgumentException("No suit with value" + value);
        }
    }

    public Class Deck<T extends Card> {
        private ArrayList<T> cards; // all cards, dealt or not
        private int dealtIndex = 0; // mark first undealt card

        public void setDeckOfCards(ArrayList<T> deckOfCards) {

        }
        public void shuffle() {

        }
        public int remainingCards() {
            return cards.size() - dealtIndex;
        }

        public T[] dealHand(int number) {

        }
        public T dealCard() {
            
        }
    }
    public abstract class Card {
        private boolean available = true;
        protected int faceValue;
        protected Suit suit;
        public Card(int c, Suit s) {
            faceValue = c;
            suit = s;
        }
        public abstract int value();
        public Suit suit() {return suit;}

        /*Checks if the card is available to be given out to someone*/
        public boolean isAvailable() {return available;}
        public void markUnavailable() {available = false;}
        public void markAvailable() {available = true;}
    }
}
