import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] intArray = new int[10];

        // Generating random elements between -255 and 255 for array
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(-255,255);
        }

        // Selection sort
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int i, newElement = intArray[firstUnsortedIndex];

            // Shifting elements
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        // Printing Array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}