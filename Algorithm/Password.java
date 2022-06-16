import java.util.Random;

public class Password {
    private static final char[] LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] DIGIT_CHARS = "0123456789".toCharArray();
    private static final char[] SPECIAL_CHARS = "-_@+?%^*()[]{}\"\'".toCharArray();
    private static final char[][] ALL_CHARS={LOWERCASE_CHARS, UPPERCASE_CHARS, DIGIT_CHARS, SPECIAL_CHARS};
    private final int MIN_LENGHT;
    private final int MAX_LENGHT;
    public Password(int minLenght, int maxLenght) {
        MIN_LENGHT = minLenght;
        MAX_LENGHT = maxLenght;
    }

    private int customRand(int mod) {
        long seed = System.currentTimeMillis();
        long random = ((long)Math.sqrt(seed<<2) + mod+seed)/(12
                * Runtime.getRuntime().freeMemory()) ;


        return (int) (random % mod);
    }
    private String generatePseudoRandomPassword() {
        StringBuilder  passwordBuilder = new StringBuilder();
        int passwordLength = customRand(MAX_LENGHT-MIN_LENGHT) + MIN_LENGHT;


        return  passwordBuilder.toString();
    }

    public static void main(String[] args) {
        Password generator = new Password(8, 20);
        for(int i =0; i<100; i++) {
            System.out.println("next random: " + generator.customRand(100));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){

            }
        }
    }
}
