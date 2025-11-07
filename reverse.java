public class reverse {
    public String reverseWord(String word) {
        String result = "";
        for(int i = word.length(); i > 0; i--) {
            result += word.substring(i-1, i);
        }
        return result;
    }
    public boolean checkPalindrome(String word) {
        return reverseWord(word).equals(word);
    }
}
