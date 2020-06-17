package task_7;

import java.util.Scanner;

/*
Task 7
The user provides the sequence of symbols as a parameter to the program. Calculate if this sequence is a palindrome.
Print YES or NO as an answer for the calculations.
 */

public class Palindrome {

    public static String characterSequence() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter character sequence:");

        String characterSequence = scanner.nextLine();
        return (characterSequence); // получено последовательность символов
    }

    public static void main(String[] args) {
        Palindrome pn = new Palindrome();

        if (pn.isPalindrome(characterSequence())) {
            System.out.println("The entered character sequence is a Palindrome");
        } else {
            System.out.println("The entered character sequence is not a Palindrome");
        }
    }

    public boolean isPalindrome(String original) {
        int i = original.length() - 1;
        int j = 0;
        while (i > j) {
            if (original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}

/*
import java.util.ArrayList;
        import java.util.List;

public class PalindromeRecursiveBoolean {

    public static boolean isPalindrome(String str) {

        str = str.toUpperCase();
        char[] strChars = str.toCharArray();

        List<Character> word = new ArrayList<>();
        for (char c : strChars) {
            word.add(c);
        }

        while (true) {
            if ((word.size() == 1) || (word.size() == 0)) {
                return true;
            }
            if (word.get(0) == word.get(word.size() - 1)) {
                word.remove(0);
                word.remove(word.size() - 1);
            } else {
                return false;
            }
        }
    }
}
*/