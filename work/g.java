package work;

public class g {
    public static int searchValue(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return -1;

            }

        }
        return number;
    }
}
