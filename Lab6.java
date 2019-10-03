import java.util.Scanner;
/**
 * Write a description of class Lab6 here.
 *
 * @author (Rose)
 * @version (08/08/2016)
 */
public class Lab6 {

    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         String name = kb.nextLine();
         while (!name.equals("#")){
             greet(name);
             name=kb.nextLine();
            }
         
    } //main
   /**
    * Greet a person
    * @param n the persons name
    */
    public static void greet(String n){
    System.out.printf("Hello %s\n", n);
    }
} // class Lab6a
