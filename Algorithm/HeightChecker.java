public class HeightChecker {
    public static int[] sorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 9};
        int[] arr1 = {1, 5, 2, 3, 9};

        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (sorting(arr)[i] == arr1[i]) {
                k += 1;
            }
        }
        k = arr.length - k;

        System.out.println("Height Checker: k = " + k);
    }
}
