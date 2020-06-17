package task_10;

import java.util.Scanner;

/*
Task 10
The program prompts name, surname, mobile phone number, email from the user and performs validation of the parameters using regular expressions.
Name, Surname - only English letters, - and space.
Phone - country code (UA|RO) and 7 any digits
email - English letters, numeric, -, underscore, @.
Print invalid data to the console.
 */

public class task_10 {

    public static String userName() { //получаем строку с именем
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first and last name:");

        String userName = scanner.nextLine();
        return (userName);
    }

    public static String userPhoneNumber() { //получаем номер
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter phone number:");

        String userPhoneNumber = scanner.nextLine();
        return (userPhoneNumber);
    }

    public static String userEmail() { //получаем эмейл
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Email:");

        String userEmail = scanner.nextLine();
        return (userEmail);
    }

    public static void main(String[] args) {

        String userName = userName();
        if (!userName.matches("^([A-z\\-]*(\\s))+[A-z\\-]*$")) {
            //только буквы английского алфавита, дефис и пробел

            System.out.println("This is not a valid first and last name");
        } else {
            System.out.println("This is a valid first and last name");
        }

        String userPhoneNumber = userPhoneNumber();
        if (!userPhoneNumber.matches("^\\+380\\d{3}\\d{2}\\d{2}\\d{2}$")) {
            //+380 далее 2 цифры кода (украина) и 7 любых цифр

            System.out.println("This is not a valid phone number");
        } else {
            System.out.println("This is a valid phone number");
        }

        String userEmail = userEmail();
        if (!userEmail.matches(
                "^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$")) {
            // любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и .

            System.out.println("This is not a valid email");
        } else {
            System.out.println("This is a valid email");
        }
    }
}