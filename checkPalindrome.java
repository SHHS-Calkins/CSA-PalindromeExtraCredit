import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = "";
        String word2 = "";
        System.out.println("Welcome! Please choose your action(1-3):");
        System.out.println("1. Get the reverse of a word.");
        System.out.println("2. Check if two words are the same.");
        System.out.println("3. Check if a word is a Palindrome.");
        int choice = scan.nextInt();
        switch(choice) {
            case 1:
                ;
                word1 = scan.nextLine();
                System.out.println(reverseWord(word1));
                break;
            case 2:
                System.out.println("1st Word:");
                word1 = scan.nextLine();
                System.out.println("2nd Word:");
                word2 = scan.nextLine();
                System.out.println("1st Word = 2nd Word?: " + word1.equals(word2));
                break;
            case 3: 
                word1 = scan.nextLine();
                System.out.println();
                break;
            default: 
                System.out.println("I said 1-3.");
                break;
        }
    }
}
