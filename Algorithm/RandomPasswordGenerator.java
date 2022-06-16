public class RandomPasswordGenerator {

    private static final char[] LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] DIGIT_CHARS = "0123456789".toCharArray();
    private static final char[] SPECIAL_CHARS = "-_@+?&%^*()[]{}\"\'".toCharArray();
    private static final char[][] ALL_CHARS = {LOWERCASE_CHARS, UPPERCASE_CHARS, DIGIT_CHARS, SPECIAL_CHARS};

    private final int MIN_LENGTH;
    private final int MAX_LENGTH;

    public RandomPasswordGenerator(int minLength, int maxLength) {
        MIN_LENGTH = minLength;
        MAX_LENGTH = maxLength;
    }

    private int customRand(int mod) {
        Long seed = System.currentTimeMillis();
        long random = ((long)Math.sqrt(seed << 2) + mod + seed) / 12
                + Runtime.getRuntime().freeMemory() + seed.hashCode();
        return (int) (random % mod);
    }

    public String generatePseudoRandomPassword() {
        StringBuilder passwordBuilder = new StringBuilder();
        int passwordLength = customRand(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH;
        // TODO
        // 1. choose random indexes for each type of characters,
        // and then choose random char from the corresponding array of chars
        // 2. fill in the remaining chars in the password with random selection of array and char

        return passwordBuilder.toString();
    }

    public static void main(String[] args) {
        RandomPasswordGenerator generator = new RandomPasswordGenerator(8, 20);
        for (int i = 0; i < 100; i++) {
            System.out.println("Next random: " + generator.customRand(100));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}
