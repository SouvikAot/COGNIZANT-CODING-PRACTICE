import java.util.Scanner;

public class Calculator {
    static double powerInt(int num1, int num2) {
        return Math.pow(num1,num2);
    }
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1,num2);
    }

    public static void main(String[] args) {
        double x=powerInt(5,2);
        double y=powerDouble(5.000,2);
        System.out.println((int)x);
        System.out.println(y);
    }
}
