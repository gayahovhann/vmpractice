public class MaxCrossingSubstring {
    public static int findmaxo(int[] array) {
        int left_sum = array[array.length / 2 -1];
        int right_sum = array[array.length / 2];
        int sum = 0;
        int max_left_ind = array.length / 2 - 1;
        int max_right_ind = array.length / 2;
        for (int i = max_left_ind; i >= 0; i--) {
            sum = sum + array[i];
            if (sum > left_sum) {
                left_sum = sum;
                max_left_ind = i;
            }
        }
        int sum1 = 0;
        for (int j = array.length / 2; j <array.length; j++) {
            sum1 = sum1 + array[j];
            if (sum1 > right_sum) {
                right_sum = sum1;
                max_right_ind = j;
            }

        }
        int[] arr1 = {sum1, sum, sum+sum1};
        return Math.max(sum1+sum, Math.max(sum1, sum));

    }
    public static int maxmaxmax(int arr[]) {

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -9, -12, 12, 8};
        System.out.println(findmaxo(arr));

        }
}
