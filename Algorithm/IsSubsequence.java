class IsSubsequence {
    public static int[] ananunFunction(String bigString, String littleString) {
        int arrInd[] = new int[littleString.length()];
        for (int i = 0; i < littleString.length(); i++) {
            for (int j = 0; j < bigString.length(); j++) {
                if (littleString.charAt(i) == bigString.charAt(j)) {
                    arrInd[i] = j;
                }
            }
        }
        return arrInd;
    }

    public static boolean result(int[] array) {
        boolean ans = false;
        for (int k = 0; k < array.length - 1; k++) {
            if (array[k] < array[k + 1])
                ans = true;
             else
                ans = false;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(result(ananunFunction("hayastan", "ystn")));

    }
}
