public class Rodcut {
    public static int memorizedRodCut(int n, int[] p) {
       int  r[] = new int[n+1];
        for(int i = 0; i <= n; i++) {
            r[i] =Integer.MIN_VALUE;
        }
        return memorizedRodCutAux(r, n, p);
    }
    public static int memorizedRodCutAux(int[] r, int n, int[] p) {
        int q=0;
        if(r[n] >=0) {
            return r[n];
        }
        if (n==0){
            q = 0;
        } else {
            q = Integer.MIN_VALUE;
            for (int i =1; i<=n; i++) {

                q = Math.max(q, p[i] +memorizedRodCutAux(r, n-i, p));

            }
            r[n] = q;
        }
       return q;
    }

    public static void main(String[] args) {
        int[] price = {0, 34, 5, 3};
        System.out.println(memorizedRodCut(3, price));

    }
}
