import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner intnumber = new Scanner(System.in);
        System.out.println("Enter 3 int numbers: ");
        int n1 = intnumber.nextInt();
        int n2 = intnumber.nextInt();
        int n3 = intnumber.nextInt();

    }
    public static void yesOrNo(int n1, int n2, int n3) {
        if (n1+n2>n3 && n1+n3>n2 &&  n2+n3>n1) {
            System.out.println("true");
        }
    }
    public Triangle(int a, int b, int c) {
        int n1 = a;
        int n2 = b;
        int n3 = c;
    }

    Triangle(int test1, int test2) {
        this(test1, test2, test2);
    }

    public static void testTri (int test1, int test2) {
        int k = test1+test2+1;
        System.out.println(k);

    }
}
