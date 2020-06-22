package task_9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
The user provides the length of the array as an input parameter. The program should create an array of that length,
fill it with random numbers and print an array and all numbers divided by 3 to the console.

ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
*/

public class task_9 {

    public static int getArrayLength() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");

        int arrayLength = scanner.nextInt();

        while (arrayLength < 10 || arrayLength > 100) { // проверяем, входит ли в границы.

            System.out.println("This is not a valid array length");
            arrayLength = scanner.nextInt(); // запрашиваем до тех пор пока не войдет в заданные границы
        }
        //System.out.println(arrayLength);
        return arrayLength; // возвращаем длину массива
    }

    public static void main(String[] args) {

        int length = getArrayLength();

        Random rand = new Random();

        int[] myArray = new int[length];  //строим массив указаной длины

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(); //заполняем массив рандомными числами
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 3 == 0) System.out.println("numbers divided by 3 from myArray: " + myArray[i]); //проверка числа в цикле на кратность
        }
        System.out.println();

        System.out.println("Array: " + Arrays.toString(myArray));
    }
}