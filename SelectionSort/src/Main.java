import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int i = 0; i < array.length; i++) {

            int indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMin]) {
                    indexOfMin = j;
                }
            }

            if (indexOfMin != i) {
                swap(array, i, indexOfMin);
            }
        }

        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }

    public static void swap(int[] array, int i, int j) {

        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
