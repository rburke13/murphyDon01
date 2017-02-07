public class CardGameTestHarness {

    private static int attempts = 0;
    private static int successes = 0;

    public static void main(String[] args) {
        attempts = 0;
        successes = 0;

        test_CardConstructors();
        test_CardToString();
        test_CardSetRankAndSuit();
        test_CardValidRank();
        test_CardCopy();

        test_DeckConstants();
        test_DeckConstructors();
        test_DeckDrawCard();
        test_DeckGetSetCardAt();
        test_DeckShuffle();
        test_DeckIsStandard();

        //TODO Tests for Hand

        //TODO Tests for CardGame

        System.out.println("-----OVERALL PERFORMANCE-----");
        System.out.println(successes + "/" + attempts + " tests passed.");
    }

    private static void displaySuccessIfTrue(boolean value) {
        attempts++;
        successes += value ? 1 : 0;

        System.out.println(value ? "success" : "failure");
    }

    public static void test_CardConstructors(){

        System.out.println("Testing Card constructors...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            Card testCard = new Card();
            displaySuccessIfTrue(testCard.getRank() == 1
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(1, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 1
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(2, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 2
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(3, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 3
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(4, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 4
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(5, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 5
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(6, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 6
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(7, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 7
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(8, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 8
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(9, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 9
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(10, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 10
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(11, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 11
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(12, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 12
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(13, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 13
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(1, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 1
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(2, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 2
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(3, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 3
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(4, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 4
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(5, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 5
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(6, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 6
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(7, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 7
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(8, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 8
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(9, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 9
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(10, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 10
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(11, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 11
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(12, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 12
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(13, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 13
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(1, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 1
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(2, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 2
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(3, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 3
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(4, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 4
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(5, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 5
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(6, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 6
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(7, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 7
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(8, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 8
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(9, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 9
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(10, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 10
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(11, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 11
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(12, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 12
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(13, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 13
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(1, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 1
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(2, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 2
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(3, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 3
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(4, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 4
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(5, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 5
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(6, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 6
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(7, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 7
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(8, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 8
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(9, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 9
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(10, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 10
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(11, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 11
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(12, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 12
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(13, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 13
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(14, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(false);
        } catch (IllegalArgumentException iae) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(0, Card.Suit.HEARTS);
            displaySuccessIfTrue(false);
        } catch (IllegalArgumentException iae) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(-1, Card.Suit.CLUBS);
            displaySuccessIfTrue(false);
        } catch (IllegalArgumentException iae) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Card constructors: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_CardToString(){
        System.out.println("Testing Card toString...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            Card testCard = new Card();
            displaySuccessIfTrue(testCard.toString().equals("Ace of Spades"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(1, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.toString().equals("Ace of Spades"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(2, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.toString().equals("2 of Hearts"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(3, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.toString().equals("3 of Clubs"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(4, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.toString().equals("4 of Diamonds"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(5, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.toString().equals("5 of Spades"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(6, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.toString().equals("6 of Hearts"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(7, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.toString().equals("7 of Clubs"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(8, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.toString().equals("8 of Diamonds"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(9, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.toString().equals("9 of Spades"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(10, Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.toString().equals("10 of Hearts"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(11, Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.toString().equals("Jack of Clubs"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(12, Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.toString().equals("Queen of Diamonds"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = new Card(13, Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.toString().equals("King of Spades"));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Card toString: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_CardSetRankAndSuit(){
        System.out.println("Testing Card setRank & setSuit...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        Card testCard = new Card();

        try {
            testCard.setRank(2);
            displaySuccessIfTrue(testCard.getRank() == 2
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 2
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(3);
            displaySuccessIfTrue(testCard.getRank() == 3
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 3
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(4);
            displaySuccessIfTrue(testCard.getRank() == 4
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 4
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(5);
            displaySuccessIfTrue(testCard.getRank() == 5
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 5
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(6);
            displaySuccessIfTrue(testCard.getRank() == 6
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 6
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(7);
            displaySuccessIfTrue(testCard.getRank() == 7
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 7
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(8);
            displaySuccessIfTrue(testCard.getRank() == 8
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 8
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(9);
            displaySuccessIfTrue(testCard.getRank() == 9
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 9
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(10);
            displaySuccessIfTrue(testCard.getRank() == 10
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.HEARTS);
            displaySuccessIfTrue(testCard.getRank() == 10
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(11);
            displaySuccessIfTrue(testCard.getRank() == 11
                    && testCard.getSuit() == Card.Suit.HEARTS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.CLUBS);
            displaySuccessIfTrue(testCard.getRank() == 11
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(12);
            displaySuccessIfTrue(testCard.getRank() == 12
                    && testCard.getSuit() == Card.Suit.CLUBS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.DIAMONDS);
            displaySuccessIfTrue(testCard.getRank() == 12
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(13);
            displaySuccessIfTrue(testCard.getRank() == 13
                    && testCard.getSuit() == Card.Suit.DIAMONDS);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setSuit(Card.Suit.SPADES);
            displaySuccessIfTrue(testCard.getRank() == 13
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(1);
            displaySuccessIfTrue(testCard.getRank() == 1
                    && testCard.getSuit() == Card.Suit.SPADES);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(14);
            displaySuccessIfTrue(false);
            displaySuccessIfTrue(false);
        } catch (IllegalArgumentException iae) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(0);
            displaySuccessIfTrue(false);
            displaySuccessIfTrue(false);
        } catch (IllegalArgumentException iae) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testCard.setRank(-1);
            displaySuccessIfTrue(false);
            displaySuccessIfTrue(false);
        } catch (IllegalArgumentException iae) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Card setRank & setSuit: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_CardValidRank(){
        System.out.println("Testing Card isValidRank...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            displaySuccessIfTrue(Card.isValidRank(1));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(2));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(3));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(4));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(5));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(6));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(7));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(8));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(9));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(10));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(11));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(12));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(Card.isValidRank(13));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!Card.isValidRank(14));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!Card.isValidRank(0));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!Card.isValidRank(-1));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Card isValidRank: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_CardCopy(){
        System.out.println("Testing Card copyCard...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            Card original = new Card();
            Card copy = original.copyCard();
            displaySuccessIfTrue(original != copy && original.equals(copy));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card original = new Card(10, Card.Suit.DIAMONDS);
            Card copy = original.copyCard();
            displaySuccessIfTrue(original != copy && original.equals(copy));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card original = new Card(6, Card.Suit.CLUBS);
            Card copy = original.copyCard();
            displaySuccessIfTrue(original != copy && original.equals(copy));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card original = new Card(13, Card.Suit.HEARTS);
            Card copy = original.copyCard();
            displaySuccessIfTrue(original != copy && original.equals(copy));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Card copyCard: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_DeckConstants(){
        System.out.println("Testing Deck constants...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            displaySuccessIfTrue(Deck.STANDARD_DECK_SIZE == 52);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Deck constants: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_DeckConstructors(){
        System.out.println("Testing Deck constructors...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            Deck testDeck = new Deck();
            displaySuccessIfTrue(testDeck.remainingCards() == 52);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Deck testDeck = new Deck(1);
            displaySuccessIfTrue(testDeck.remainingCards() == 52
                    && testDeck.equals( new Deck() ) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Deck testDeck = new Deck(5);
            displaySuccessIfTrue(testDeck.remainingCards() == 260);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Deck testDeck = new Deck(7);
            displaySuccessIfTrue(testDeck.remainingCards() == 364);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Deck testDeck = new Deck(0);
            displaySuccessIfTrue(false);
        } catch(IllegalArgumentException iae) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Deck testDeck = new Deck(-3);
            displaySuccessIfTrue(false);
        } catch(IllegalArgumentException iae) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Deck constructors: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_DeckDrawCard(){
        System.out.println("Testing Deck drawCardFromTop...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        Deck testDeck = new Deck();

        try {
            Card firstCard = testDeck.drawCardFromTop();
            Card secondCard = testDeck.drawCardFromTop();
            displaySuccessIfTrue(testDeck.remainingCards() == 50 && !firstCard.equals(secondCard) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testDeck.drawCardFromTop();
            displaySuccessIfTrue(testDeck.remainingCards() == 49);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            for (int i = 0; i < 49; i++) {
                testDeck.drawCardFromTop();
            }
            displaySuccessIfTrue(testDeck.remainingCards() == 0);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testDeck.drawCardFromTop();
            displaySuccessIfTrue(false);
        } catch(ArrayIndexOutOfBoundsException aioobe) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Deck drawCardFromTop: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_DeckGetSetCardAt(){
        System.out.println("Testing Deck getCardAt & setCardAt...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        Deck testDeck = new Deck();

        try {
            Card testCard = testDeck.getCardAt(5);
            displaySuccessIfTrue( Card.isValidRank( testCard.getRank() )
                    && testCard.getSuit() != null );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = testDeck.getCardAt(5);
            Card newCard = new Card(10, Card.Suit.DIAMONDS);
            if ( newCard.equals(testCard) ) {
                newCard.setRank(9);
            }
            testDeck.setCardAt(5, newCard);
            displaySuccessIfTrue( testDeck.getCardAt(5).equals(newCard) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = testDeck.getCardAt(12);
            Card newCard = new Card(4, Card.Suit.CLUBS);
            if ( newCard.equals(testCard) ) {
                newCard.setRank(5);
            }
            testDeck.setCardAt(12, newCard);
            displaySuccessIfTrue( testDeck.getCardAt(12).equals(newCard) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = testDeck.getCardAt(52);
            displaySuccessIfTrue(false);
        } catch(ArrayIndexOutOfBoundsException aioobe) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = testDeck.getCardAt(78);
            displaySuccessIfTrue(false);
        } catch(ArrayIndexOutOfBoundsException aioobe) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card testCard = testDeck.getCardAt(-12);
            displaySuccessIfTrue(false);
        } catch(ArrayIndexOutOfBoundsException aioobe) {
            displaySuccessIfTrue(true);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Deck getCardAt & setCardAt: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_DeckShuffle(){
        System.out.println("Testing Deck shuffle...");
        System.out.println("WARNING: May rarely give false results due to random nature");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        Deck firstDeckStandard = new Deck();
        Deck secondDeckStandard = new Deck();
        Deck controlDeckStandard = new Deck();

        try {
            displaySuccessIfTrue( firstDeckStandard.orderedEquals(secondDeckStandard)
                    && firstDeckStandard.equals(secondDeckStandard)
                    && firstDeckStandard.equals(controlDeckStandard)
                    && secondDeckStandard.equals(controlDeckStandard));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        for (int i = 0; i < 10; i++) {
            try {
                firstDeckStandard.shuffle();
                secondDeckStandard.shuffle();
                displaySuccessIfTrue( !firstDeckStandard.orderedEquals(secondDeckStandard)
                        && firstDeckStandard.equals(secondDeckStandard)
                        && firstDeckStandard.equals(controlDeckStandard)
                        && secondDeckStandard.equals(controlDeckStandard));
            } catch(Exception e) {
                displaySuccessIfTrue(false);
            }
        }


        Deck firstDeckTriple = new Deck(3);
        Deck secondDeckTriple = new Deck(3);
        Deck controlDeckTriple = new Deck(3);

        try {
            displaySuccessIfTrue( firstDeckTriple.orderedEquals(secondDeckTriple)
                    && firstDeckTriple.equals(secondDeckTriple)
                    && firstDeckTriple.equals(controlDeckTriple)
                    && secondDeckTriple.equals(controlDeckTriple));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        for (int i = 0; i < 10; i++) {
            try {
                firstDeckTriple.shuffle();
                secondDeckTriple.shuffle();
                displaySuccessIfTrue( !firstDeckTriple.orderedEquals(secondDeckTriple)
                        && firstDeckTriple.equals(secondDeckTriple)
                        && firstDeckTriple.equals(controlDeckTriple)
                        && secondDeckTriple.equals(controlDeckTriple));
            } catch(Exception e) {
                displaySuccessIfTrue(false);
            }
        }

        System.out.println("Deck shuffle: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_DeckIsStandard(){
        System.out.println("Testing Deck isStandardDeck...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        Deck testDeck = new Deck();

        try {
            displaySuccessIfTrue( testDeck.isStandardDeck() );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            testDeck.shuffle();
            displaySuccessIfTrue( testDeck.isStandardDeck() );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Card newCard = new Card(10, Card.Suit.DIAMONDS);
            if ( newCard.equals(testDeck.getCardAt(5)) ) {
                newCard.setRank(9);
            }
            testDeck.setCardAt(5, newCard);
            displaySuccessIfTrue( !testDeck.isStandardDeck() );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            Deck doubleDeck = new Deck(2);
            displaySuccessIfTrue( !doubleDeck.isStandardDeck() );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("Deck isStandardDeck: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }
}
