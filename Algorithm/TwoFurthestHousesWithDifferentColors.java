public class TwoFurthestHousesWithDifferentColors {
    public static int maximalDistance(int[] arrDist) {
        int bestDist = 0;
        for (int i = 0; i < arrDist.length - 1; i++) {
            for (int j = i + 1; j < arrDist.length; j++) {
                if (arrDist[i] != arrDist[j] && Math.abs(i - j) > bestDist) {
                        bestDist = Math.abs(i - j);
                }
            }
        }
        return bestDist;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 6, 1, 1, 1};
        System.out.println("max distance is: " + maximalDistance(arr));
    }
}
