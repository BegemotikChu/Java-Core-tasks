package task_5;

import java.util.Scanner;

/*
Task 5
Create a program that gets the number of type long as a parameter and calculates the lowest and biggest digit in its number.
Print results in a console.

E.g. for 15875 => lowest is 1, biggest is 8
 */
public class SearchMinMaxNumberInLong {

    public static void main(String[] args) {
        String dd = number();
        long number = Long.valueOf(dd);
        System.out.println("For " + number + "=>");
        printMinMaxDigit(number);

    }

    public static String number() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer (long)");

        return scanner.nextLine(); //получено число
    }

    public static void printMinMaxDigit(long number) {
        if (number == 0) {
            return;
        }

        int maxDigit = 0;
        int minDigit = 9;
        while (number != 0) {
            int digit = (int) (number % 10);
            if (digit < minDigit) {
                minDigit = digit;
            }
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number = number / 10;
        }
        System.out.println("    lowest digit is " + minDigit);
        System.out.println("    biggest digit is " + maxDigit);
    }
}
/*
public class Task5 {
    public static void main(String[] args) {
        long positiveNumber = 15875;
        System.out.println("We set the number:" + positiveNumber);

        long fifthDigit = positiveNumber % 10;
        long nextNumber4 = positiveNumber / 10;

        long fourthDigit = nextNumber4 % 10;
        long nextNumber3 = nextNumber4 / 10;

        long thirdDigit = nextNumber3 % 10;
        long nextNumber2 = nextNumber3 / 10;

        long secondDigit = nextNumber2 % 10;
        long firstDigit = nextNumber2 / 10;

        long a = firstDigit;
        long b = secondDigit;
        long c = thirdDigit;
        long d = fourthDigit;
        long e = fifthDigit;

        if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) { // a >= b,c,d,e
            System.out.println("The largest number is: " + a);
        } else if ((b >= c) && (b >= d) && (b >= e)) {      // b >= c,d,e
            System.out.println("The largest number is: " + b);
        } else if ((c >= d) && (c >= e)) {                  // c >= d,e
            System.out.println("The largest number is: " + c);
        } else if (d >= e) {                                // d >= e
            System.out.println("The largest number is: " + d);
        } else {                                            // e > d
            System.out.println("The largest number is: " + e);
        }

        if ((a <= b) && (a <= c) && (a <= d) && (a <= e)) { // a <= b,c,d,e
            System.out.println("The smallest number is: " + a);
        } else if ((b <= c) && (b <= d) && (b <= e)) {      // b <= c,d,e
            System.out.println("The smallest number is: " + b);
        } else if ((c <= d) && (c <= e)) {                  // c <= d,e
            System.out.println("The smallest number is: " + c);
        } else if (d <= e) {                                // d <= e
            System.out.println("The smallest number is: " + d);
        } else {                                            // e < d
            System.out.println("The smallest number is: " + e);
        }
    }
}
*/