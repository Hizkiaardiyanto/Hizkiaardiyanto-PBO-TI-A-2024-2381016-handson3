package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulaBuah = new String[] {"Apel", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        do {
            System.out.println("Element ke - " + (counter + 1) + ": " + kumpulaBuah[counter]);
            counter++;
        } while (counter < kumpulaBuah.length);
    }
}
