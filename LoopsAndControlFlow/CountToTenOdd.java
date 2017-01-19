// CountToTenOdd.java

public class CountToTenOdd {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            } else if (i % 5 == 0) {
                System.out.print(i + "! ");
            }
        }
    }
}
