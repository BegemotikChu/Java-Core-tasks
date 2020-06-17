package task_1;

/*
Task 1

Create a program, which solves the following equations. Variables x,y,z,n should be initialized before the equation.
Each solution should be placed in a separate static method.

x - (y + 123) / z * n   => cast result as  long
(x + (50 - y * z) / n) - x   => cast result as  int
x / (y * (z - 1) - 564) + n   => cast result as  float
-x / -y + z / (n + 15)   => cast result as  double

*/
public class task1 {
    public static void main(String[] args) {

        System.out.println("Результат уравнения x - (y + 123) / z * n = " + one());
        System.out.println("Результат уравнения (x + (50 - y * z) / n) - x = " + two());
        System.out.println("Результат уравнения x / (y * (z - 1) - 564) + n = " + three());
        System.out.println("Результат уравнения -x / -y + z / (n + 15) = " + four());
    }

    public static long one() {

        long x = 1;
        long y = 1;
        long z = 341;
        long n = 851;

        return x - (y + 123) / z * n;
    }

    public static int two() {

        int x = 134343;
        int y = 13434;
        int z = 451;
        int n = 13434;

        int b;
        b = (x + (50 - y * z) / n) - x;

        return b;
    }

    public static float three() {

        float x = 500;
        float y = 1;
        float z = 3;
        float n = 1;

        float c;
        c = x / (y * (z - 1) - 564) + n;

        return c;
    }

    public static double four() {

        double x = 500;
        double y = 1745845849;
        double z = 34343434;
        double n = 3435351;

        double d;
        d = -x / -y + z / (n + 15);

        return d;
    }
}