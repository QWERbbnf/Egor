public class mainTest {
    public static void Sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
    }
}
