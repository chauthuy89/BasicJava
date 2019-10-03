import java.util.Scanner;
/**
 * Write a description of class FormalNames here.
 *
 * @author (Rose)
 * @version (version 1)
 */
public class Lab4 {

    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         String formal = kb.nextLine();
         getName(formal);
        }    
    public static void getName(String formal) {
         int comma = formal.indexOf(",");
         String surname = formal.substring(0,comma);
         String firstname = formal.substring(comma + 2);
         System.out.printf("%s %s", firstname, surname);
         
        }    
         
    } //main


