import java.util.HashMap;
import java.util.Map;
/**
 * Deck represents a deck of playing cards using French suits that can be drawn
 * from and shuffled.
 */

public class Deck {
    private Card[] cards;

    private int topCardIndex;

    public static final int STANDARD_DECK_SIZE = 0; //TODO: Initialize this variable properly!

    /**
     * Constructs an unshuffled standard 52 card deck using French suits.
     */
    public Deck() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Constructs an unshuffled card deck using French suits with as many copies
     * of each card as specified by the parameter.
     * @param copiesPerCard     the number of each rank and suit combination
     *                          card to put in the Deck
     * @throws IllegalArgumentException      if a nonpositive number of copies
     *                                       is provided
     */
    public Deck( int copiesPerCard ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns the remaining number of cards in this deck that have not yet been
     * drawn.
     *
     * @return         the number of cards remaining in the deck
     */
    public int remainingCards() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns a copy of the card at the top of the deck, making the next card
     * the new top of the deck.
     *
     * @return         a copy of the Card at the top of the deck
     * @throws ArrayIndexOutOfBoundsException      if there are no more cards left to draw
     */
    public Card drawCardFromTop() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Indicates whether this Deck is contains the same cards in the same order
     * as the other provided Deck.
     *
     * @param otherDeck      the other Deck with which to compare.
     * @return               <code>true</code> if both Decks contains the same
     *                       cards in the same order; <code>false</code>
     *                       otherwise.
     */
    public boolean orderedEquals( Deck otherDeck ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns the card at the given index in this Deck.
     *
     * @param index    the index of the Card in the Deck
     * @return         the Card at the given index.
     */
    public Card getCardAt( int index ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Replaces the Card at the given index in this Deck with a copy of the
     * provided Card.
     *
     * @param index       the index of the Card to be replaced
     * @param card        the Card to be inserted into the Deck
     */
    public void setCardAt( int index, Card card ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Randomly reorders this deck, including any drawn cards.
     */
    public void shuffle() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns whether this Deck is a standard 52-card deck with one copy of
     * each rank and suit combination.
     *
     * @return         <code>true</code> if this Deck is a standard 52-card deck
     *                 argument; <code>false</code> otherwise.
     */
    public boolean isStandardDeck() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns a string representation of this Deck, including all cards in the
     * deck in their current order in the Deck and starting at the top card.
     *
     * @return         a string representation of the Deck
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    // Advanced Java---Proceed at own risk!
    /**
     * Indicates whether some other object is "equal to" this one,
     * of the same class and containing the same cards in the same amounts,
     * regardless of order.
     *
     * @param obj      the reference object with which to compare.
     * @return         <code>true</code> if this object is equal to the obj
     *                 argument; <code>false</code> otherwise.
     */
    @Override
    public boolean equals( Object obj ) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Deck other = (Deck)obj;
        // Due to the possibility of duplicates, deck comparison is a notch trickier.
        // Our approach is to count the cards in each deck then ensure that the cards
        // and counts are the same.
        return tally().equals(other.tally());
    }

    /**
     * Returns a Map tallying the number of times each card appears in the Deck.
     *
     * @return         A Map tallying the amounts of each possible
     */
    private Map<Card, Integer> tally() {
        Map<Card, Integer> result = new HashMap<Card, Integer>();
        for (Card card: this.cards) {
            Integer value = result.get(card);
            if (value == null) {
                result.put(card, 1);
            } else {
                result.put(card, value + 1);
            }
        }
        return result;
    }
}
