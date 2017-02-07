/**
 * Hand represents a hand of playing cards using French suits containing a set
 * number of cards.
 */
public class Hand {
    private Card[] cardsInHand;
    public static final int STANDARD_HAND_SIZE = 0; //TODO: Initialize this variable properly!

    /**
     * Constructs an empty hand of the standard hand size.
     */
    public Hand() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Constructs an empty hand of the provided size.
     * @param handSize     the number of cards the hand can hold
     * @throws IllegalArgumentException    if an non-positive hand size is provided
     */
    public Hand( int handSize ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Draws a new hand from the provided deck, replacing the cards in the hand
     * with the top cards from the deck. The new top card of the deck is the
     * card after the last drawn card.
     *
     * @param deck     the number of cards the hand can hold
     */
    public void drawNewHandFrom( Deck deck ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns the maximum hand size of this hand.
     *
     * @return          the number of card this hand can hold
     */
    public int getHandSize() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns the card at the given index in this hand.
     *
     * @param index     the index of the card in the hand
     * @return          the card at the provided index in the hand
     */
    public Card getCardAt( int index ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns a string representation of this hand, including all cards in the
     * hand.
     *
     * @return         a string representation of the hand
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns whether this hand contains a card of the same rank suit as the
     * provided card.
     *
     * @param card     the card being searched for
     * @return         <code>true</code> if this hand contains an equivalent
     *                 card; <code>false</code> otherwise.
     */
    public boolean contains( Card card ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns the number of cards in this hand with the provided rank.
     *
     * @param rank     the rank being searched for
     * @return         the number of cards in the hand with the provided rank
     * @throws IllegalArgumentException    if an invalid rank is provided
     */
    public int countInHand( int rank ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns the number of cards in this hand with the provided suit.
     *
     * @param suit     the suit being searched for
     * @return         the number of cards in the hand with the provided suit
     */
    public int countInHand( Card.Suit suit ) {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }

    /**
     * Returns the number of cards in this hand with the "face" ranks of King,
     * Queen, and Jack.
     *
     * @return         the number of cards in the hand with face ranks
     */
    public int countOfFaceCards() {
        throw new UnsupportedOperationException();
        //TODO: Complete this method!
    }
}
