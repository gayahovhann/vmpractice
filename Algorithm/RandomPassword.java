import java.util.*;
import java.util.Random;

public class RandomPassword {
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static void main(String[] args) {
        String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
        String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String DIGIT_CHARS = "0123456789";
        String SPECIAL_CHARS = "-_@+?&%^*()[]{}\"\'";
        String[] ALL_CHARS = {LOWERCASE_CHARS, UPPERCASE_CHARS, DIGIT_CHARS, SPECIAL_CHARS};
        Random random = new Random();

        //empty password
        String password = "";

        // generate password length
        int pass_length = getRandomNumberUsingNextInt(8, 21);
        System.out.println("password length is: " + pass_length);


        for (int j = 0; j < pass_length; j++) {
            //generates sym type
            int patternNumber = getRandomNumberUsingNextInt(0, 4);

            int indexOfSymbol = getRandomNumberUsingNextInt(0, ALL_CHARS[patternNumber].length());

            password = password + ALL_CHARS[patternNumber].charAt(indexOfSymbol);
        }
        System.out.println("password is:" + password);
    }
}

