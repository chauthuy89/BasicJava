import java.util.Scanner;
/**
 * Write a description of class Lab1 here.
 *
 * @author (Rose)
 * @version (a version number 1)
 */
public class Lab1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String firstname= kb.nextLine();
        String familyname= kb.nextLine();
        String location= kb.nextLine();
        System.out.println("Hello " + firstname +" "+ familyname+ " of " + location);
    } //main

} // class Greet1
