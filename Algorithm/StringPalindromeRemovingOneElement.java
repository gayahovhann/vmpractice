public class StringPalindromeRemovingOneElement {
    public static String charRemove(String str, int removing_index) {

        StringBuilder valodik = new StringBuilder(str);
        valodik.deleteCharAt(removing_index);
        return valodik.toString();
    }

    public static Boolean palindrome(String remString) {

        int num = 0;
        int i = 0;
        int j = remString.length() - 1;
        while (i < j) {
            if (remString.charAt(i) != remString.charAt(j)) {
                return false;
            }
            i = i + 1;
            j = j - 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String mainStr = "PutinituP";
        String answer = "No  :/ ";
        for (int h = 0; h < mainStr.length(); h++) {
            if (palindrome(charRemove(mainStr, h))) {
                answer = "Yes!";
            }
        }
        System.out.println("Here is answer: " + answer);
    }
}