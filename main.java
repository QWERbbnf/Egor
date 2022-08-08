public class main {
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

    public static void main(String[] args) {

        int[] array = {34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20};
        System.out.println("Было: " + array.toString());
        Sort(array);
        System.out.println("Стало: " + array.toString());
    }