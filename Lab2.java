
/**
 * Write a description of class Mathsapp here.
 *
 * @author (Rose)
 * @version (version 1)
 */
import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
       System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
       System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
       System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
    } //main

} // class Mathsapp
