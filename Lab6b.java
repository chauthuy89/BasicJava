import java.util.Scanner;
/**
 * Write a description of class Lab6b
 * here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab6b {

    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      String name = kb.nextLine();
      while (!name.equals("#")){
          System.out.printf("%s\n",helloName(name));
          name = kb.nextLine();
      
    } //main

} // class Lab6
     public static String helloName(String name) {
     name = "Hello " + name;
     return name;
    }
}