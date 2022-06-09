// data = [8, 5, 2, 7, 6, 4, 1, 3]
//data1 = [2, 5, 7, 8]
//data2 = [1, 3, 4, 6]
public class Merge {
    public static int[] sort(int[] arr1, int[] arr2) {
        int[] arr = {};
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[i] = arr1[i];
                i += 1;
            } else {
                arr[i] = arr1[j];
                j += 1;
            }

        }

//        while(j < arr2.length) {
//
//            j+=1;
//
//        }
//
//        while (i<arr1.length) {
//            i+=1;
//        }
        return arr;
    }
    public static void print(int[] arr){
        for (int value : arr) {
            System.out.print(value + "  ");
        }

    }

    public static void main(String[] args) {
        int[] data1 = {2, 5, 7, 8};
        int[] data2 = {1, 3, 4, 6};
        print(sort(data1, data2));

    }
}
