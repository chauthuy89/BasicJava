import java.util.Scanner;
/**
 * Write a description of class Lab22 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab22 {

    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         String line;
         while(!(line = kb.nextLine()).equals("#")){
            getResults(line);
         }
         
    } //main
    public static void getResults(String line){
        Scanner str = new Scanner(line);
        str.useDelimiter(",");
        String lname = str.next();
        String fname = str.next();
        int total = 0;
        while (str.hasNextInt()){
            total += str.nextInt();
        }
        System.out.printf("%s %s %d\n", fname, lname, total);
    }
} // class Lab22
