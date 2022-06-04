import java.util.*;

class Msjorityelement {

    static boolean mostFrequent(int arr[], int n) {
        // Sort the array
        //merge sort
        Arrays.sort(arr);

        // find the max frequency using linear traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
                curr_count = 1;

            if (curr_count > max_count) {
                max_count = curr_count;
                res = arr[i - 1];
            }
        }

        if (max_count > arr.length / 2) {
            System.out.println("majority element is:  " + res);
            return true;
        } else {
            System.out.println("oops, but NO!");
            return false;
        }

    }

    // Driver program
    public static void main(String[] args) {
        int arr[] = {40, 50, 30, 30, 30, 40, 50, 30, 30};
        int n = arr.length;
        System.out.println(mostFrequent(arr, n));
    }
}