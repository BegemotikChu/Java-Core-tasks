package task_3;

/*
Task 3
Create a program, which for three coordinates of the vector calculates unit vector and prints result to the console.

For calculating the unit vector, you should calculate the length of source vector and divide each of the coordinates on that length.

The formulate for source vector length: Math.sqrt(X * X + Y * Y + Z * Z)

E.g. unit vectors for the (5,0,0) => (1,0,0)
 */
public class task3 {
    public static void main(String[] args) {

        double X = 5;
        double Y = 0;
        double Z = 0;

        double dvector;
        dvector = Math.sqrt(X * X + Y * Y + Z * Z); //длина считается как корень из суммы квадратов, то есть отрицательного числа быть не может

        //System.out.printf ("%.5f",dvector); // округление до 5 знаков после запятой
        // System.out.println("Длина вектора (X, Y, Z) = " + Math.abs(dvector)); //выводит длину вектора по модулю

        System.out.println(
                "Unit vectors for the (5,0,0) => " + "(" + asInt(X / Math.abs(dvector)) + "," + asInt(Y / Math.abs(dvector)) + "," + asInt(Z / Math.abs(
                        dvector)) + ")"); //разделить каждую из координат на эту длину
    }

    private static int asInt(double d) {
        return Double.valueOf(d).intValue();
    }
}