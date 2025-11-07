package stuff;
public class methodClass {
    public static String reverseWord(String word) {
        String result = "";
        for(int i = word.length(); i > 0; i--) {
            result += word.substring(i-1, i);
        }
        return result;
    }
    public static boolean isPalindrome(String word) {
        return reverseWord(word).equals(word);
    }
}
