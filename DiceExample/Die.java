public class Die {
    public static final int DEFAULT_NUMBER_OF_SIDES = 6;

    private int numberOfSides;
    private int faceUpSide;

    public Die() {
        this.numberOfSides = DEFAULT_NUMBER_OF_SIDES;
        this.faceUpSide = 1;
    }

    public Die( int numberOfSides ) {
        this.setNumberOfSides(numberOfSides);
        this.faceUpSide = 1;
    }

    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public void setNumberOfSides( int numberOfSides ) {
        if ( numberOfSides <= 1 ) {
            throw new IllegalArgumentException();
        }
        this.numberOfSides = numberOfSides;
        this.faceUpSide = 1;
    }

    public int getFaceUpSide() {
        return this.faceUpSide;
    }

    public void setFaceUpSide( int faceUpSide ) {
        if ( faceUpSide < 1 || faceUpSide > this.numberOfSides) {
            throw new IllegalArgumentException();
        }
        this.faceUpSide = faceUpSide;
    }

    public void roll() {
        this.faceUpSide = (int)(Math.random() * this.numberOfSides) + 1;
    }

    @Override
    public String toString() {
        return "d" + this.numberOfSides + ": " + this.faceUpSide;
    }

    public static void main( String[] args ) {
        Die basicDie = new Die();
        Die tenSidedDie = new Die(10);
        Die coin = new Die(2);

        try {
            Die badDie = new Die(-1);
            System.out.println("This shouldn't be possible!");
        } catch ( IllegalArgumentException iae ) {
            System.out.println("Proper exception thrown!");
        } catch ( Exception e) {
            System.out.println("Wrong exception thrown!");
        }

        System.out.println(basicDie + "\n" + tenSidedDie + "\n" + coin);

        try {
            basicDie.setFaceUpSide(3);
            System.out.println(basicDie.getFaceUpSide() == 3 ? "Passed!" : "Failed!");
        } catch ( Exception e) {
            System.out.println("Failed due to exception!");
        }
        System.out.println(basicDie);

        try {
            tenSidedDie.setFaceUpSide(11);
            System.out.println("This shouldn't be possible!");
        } catch ( IllegalArgumentException iae ) {
            System.out.println("Proper exception thrown!");
        } catch ( Exception e) {
            System.out.println("Wrong exception thrown!");
        }
        System.out.println(tenSidedDie);

        try {
            coin.setFaceUpSide(-3);
            System.out.println("This shouldn't be possible!");
        } catch ( IllegalArgumentException iae ) {
            System.out.println("Proper exception thrown!");
        } catch ( Exception e) {
            System.out.println("Wrong exception thrown!");
        }
        System.out.println(coin);

        for (int i = 0; i < 10; i++) {
            basicDie.roll();
            tenSidedDie.roll();
            coin.roll();
            System.out.println(basicDie + ", " + tenSidedDie + ", " + coin);
        }
    }
}
