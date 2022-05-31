public class InsertionSortImplementation {
    public static void insertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j=j-1;

            }
            array[j + 1] = key;

        }
        for (int value : array) {
            System.out.println(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6};
        insertion(arr);
    }
}
