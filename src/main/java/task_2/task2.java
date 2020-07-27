package task_2;

/*
Task 2
Create a program, which decomposes 5-digit number to separate digits, from right to left. The number is provided as a parameter to the method.
Each digit should be printed to console on a separate line.

E.g. 45685 =>

4
5
6
8
5
 */

public class task2 {
    public static void main(String[] args) {
        int q = 45685;
        while (q != 0) {
            System.out.println(q % 10);
            q = q / 10;
        }
    }
}