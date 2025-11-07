import java.util.Scanner;
import stuff.methodClass;
public class stringStuff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = "";
        String word2 = "";
        int choice = 0;
        System.out.print("Welcome! ");
        while (choice != 4) {
        System.out.println("Please choose your action(1-3):");
        System.out.println("1. Get the reverse of a word.");
        System.out.println("2. Check if two words are the same.");
        System.out.println("3. Check if a word is a Palindrome.");
        System.out.println("4. Quit the program.");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    scan.nextLine();
                    word1 = scan.nextLine();
                    System.out.println(methodClass.reverseWord(word1));
                    break;
                case 2:
                    System.out.println("1st Word:");
                    scan.nextLine();
                    word1 = scan.nextLine();
                    System.out.println("2nd Word:");
                    word2 = scan.nextLine();
                    System.out.println("1st Word = 2nd Word?: " + word1.equalsIgnoreCase(word2));
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Word: ");
                    word1 = scan.nextLine();
                    System.out.println(methodClass.isPalindrome(word1));
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("I said 1-3.");
                    break;
            }
        }
        scan.close();
    }
}
