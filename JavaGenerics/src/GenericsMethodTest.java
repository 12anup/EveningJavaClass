public class GenericsMethodTest {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 28, 41, 84, 98, 64, 654};
        Double[] doubleArray = {1.2, 2.8, 4.1, .84, 2.98, 0.64};
        Character[] charArray = {'R', 'A', 'M', 'B', 'A', 'H', 'A', 'D', 'U', 'R'};

        System.out.println("Printing Array of an Integer");
        printArray(intArray);
        System.out.println("Printing Array of Double");
        printArray(doubleArray);
        System.out.println("Printing Array of Character");
        printArray(charArray);
    }
}
