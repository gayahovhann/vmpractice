public class Methods2Day3 {
    public static void maxim(int a, int b) {
        if(a > b) {
            System.out.println("a is maximum");
        } else {
            System.out.println("b is maximum");
        }
    }

    public static void maxim(double a, double b) {
        if(a > b) {
            System.out.println("a is maximum");
        } else {
            System.out.println("b is maximum");
        }
    }


    public static void numberOfInteger(int num) {
        int count = 0;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        int[] arrdigit = {};
        for(int i =0; i<count; i++) {
            int j = num%10;
            arrdigit[i] = arrdigit[i]+j;
            num = (num-j)/10;
        }
//        System.out.println("Number of digits: " + count);
        for(int l =0; l<count; l++) {
            System.out.println(arrdigit[l]);
        }
    }
    public static void main(String[] args) {
//        maxim(3, 6);
//        maxim(7.3, 1.9);
          numberOfInteger(643);

    }
}
