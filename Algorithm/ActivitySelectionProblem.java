import java.util.ArrayList;

public class ActivitySelectionProblem {
    public static int activitySelection(int s[], int[] f, int n, int k, ArrayList<Integer> array) {
        int m = k + 1;
        while (m <= n && s[m] < f[k]) {
            m = m + 1;
        }
        if (m <= n) {
            array.add(m+1);
            return activitySelection(s, f, n, m, array);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {


        int[] start = {1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12};
        int[] finish = {4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16};
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        activitySelection(start, finish, 10, 0, array);
        for(int i = 1; i <array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

}
