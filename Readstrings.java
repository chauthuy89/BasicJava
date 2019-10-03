
/**
 * Write a description of class Readstrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Readstrings {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       String words;
       System.out.println("Please enter a line of words");
       words = keyboard.nextLine();
       System.out.println("You entered" + words);
    } //main

} // class Readstrings
