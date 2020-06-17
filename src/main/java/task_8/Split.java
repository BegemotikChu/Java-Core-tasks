package task_8;

import java.util.Scanner;

/*
Task 8
The user enters the string. The program should split the string by words, turn each word "upside-down",
make a new string and print it to the console.

String[] words = “Sadfsdfs sdfsdf sdfsdf”.split(“ ”);
*/

public class Split {

    public static String firstString() { //Получаем строку от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String firstString = scanner.nextLine();
        return (firstString);
    }

    public static StringBuffer splittedString() { //переворачиваем слова reverse() (возвращает объект StringBuffer с обратной последовательностью)
        StringBuffer buffer = new StringBuffer(firstString());
        buffer.reverse();
        return (buffer);
    }

    public static void main(String[] args) { // Разбиваем перевернутую строку на слова с помощью разграничителя (пробел)" "
        String str = String.valueOf(splittedString());
        String[] arr = str.split(" ");
        for (String ss : arr) {
            System.out.println(ss);
        }
    }
}

/*
    String[] words = str.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
// Вывод на экран
        for (String subStr : words) {
                System.out.println(subStr);
                }
 */