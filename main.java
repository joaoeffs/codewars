public class FindOdd {

    private static int[] matriz;

    public static int findIt(int[] array) {
        matriz = array;

        for(int i = 0; i < array.length; i++) {
            int number = array[i];

            if (isOdd(number)) {
                return number;
            }
        }
        return 0;
    }

    public static boolean isOdd(int number) {
        return getOccurrences(number) % 2 != 0;
    }


    public static int getOccurrences(int numero) {
        int amountOccurrences = 0;

        for (int j = 0; j < matriz.length; j++) {
            if (matriz[j] == numero) {
                amountOccurrences++;
            }
        }

        return amountOccurrences;
    }

}
