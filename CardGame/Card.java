/**
 * Card represents a single playing card using French suits.
 */
public class Card {

    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public enum Suit {
        CLUBS("Clubs"), SPADES("Spades"), HEARTS("Hearts"), DIAMONDS("Diamonds");
        private String value;

        private Suit(String value) {
            this.value = value;
        }
    }

    private int rank;
    private Suit suit;

    /**
     * Constructs a single Card, the Ace of Spades.
     */
    public Card() {
        this.rank = ACE;
        this.suit = Suit.SPADES;
    }

    /**
     * Constructs a single Card of the given rank and suit.
     *
     * @param rank     the rank of the card as an integer (Ace = 1, Jack = 11, etc.)
     * @param suit     the Suit enum representing one of the French suits
     * @throws IllegalArgumentException      if a nonstandard rank is provided
     */
    public Card ( int rank, Suit suit ) {
        if ( !isValidRank(rank) ) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns the rank of this card.
     *
     * @return         the rank of this card as an int
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Returns the suit of this card.
     *
     * @return         the suit of this card as a Suit enum
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * Changes the rank of this card to the provided rank.
     *
     * @param rank     the rank of the card as an integer (Ace = 1, Jack = 11, etc.)
     * @throws IllegalArgumentException      if a nonstandard rank is provided
     */
    public void setRank( int rank ) {
        if ( !isValidRank(rank) ) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
    }

    /**
     * Changes the suit of this card to the provided suit.
     *
     * @param suit     the Suit enum representing one of the French suits
     */
    public void setSuit( Suit suit ) {
        this.suit = suit;
    }

    /**
     * Returns a String containing the name of the rank of this card. Aces,
     * Jacks, Queens, and Kings are spelled out, while other ranks are only
     * the numerical value as a String.
     *
     * @return         the String represention of this card's rank
     */
    public String getRankString() {
        switch (this.rank) {
            case ACE: return "Ace";
            case JACK: return "Jack";
            case QUEEN: return "Queen";
            case KING: return "King";
            default: return "" + this.rank;
        }
    }

    /**
     * Returns whether the provided rank is a valid rank in a standard 52-card
     * deck in the French suits.
     *
     * @param rank     the rank being tested, represented as an integer
     * @return         <code>true</code> if the rank is a valid rank;
     *                 <code>false</code> otherwise.
     */
    public static boolean isValidRank( int rank ) {
        return rank >= ACE && rank <= KING;
    }

    /**
     * Returns a copy of this card with the same rank and suit.
     *
     * @return         a new Card with the same rank and suit
     */
    public Card copyCard() {
        return new Card(this.rank, this.suit);
    }

    /**
     * Returns a string representation of the card. For example, a Card with
     * rank 11 and suit CLUBS would cause this method to return:
     * <code>Jack of Clubs</code>
     *
     * @return         a string representation of the card
     */
    @Override
    public String toString() {
        return this.getRankString() + " of " + suit.value;
    }

    // Advanced Java---Proceed at own risk!
    /**
     * Indicates whether some other object is "equal to" this one,
     * of the same class and with the same rank and suit.
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

        Card other = (Card)obj;
        return (this.rank == other.rank) && (this.suit == other.suit);
    }

    /**
     * Returns a hash code value for the Card unique to the rank and suit
     * combination.
     *
     * @return     a hash code value for this Card
     */
    @Override
    public int hashCode() {
        final int prime = 43;
        int result = 1;
        result = prime * result + ((suit == null) ? 0 : suit.hashCode());
        result = prime * result + rank;
        return result;
    }

}
