import java.util.Scanner;
/**
 * Write a description of class Lab17 here.
 *
 * @author (Rose)
 * @version (22/08/2016)
 */
public class Lab17 {

    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         String line = kb.nextLine();
        
         while (!line.equals("#")){
            process(line);
            line = kb.nextLine();
            }
    } //main
    public static void process(String line){
        Scanner linein = new Scanner(line);
        linein.useDelimiter(",");
        String surname = linein.next();
        String firstname = linein.next();
         int score1 = linein.nextInt();
         int score2 = linein.nextInt();
         int score3 = linein.nextInt();
         int score4 = linein.nextInt();
         System.out.printf("%s %s %d\n",firstname,surname,score1+score2+score3+score4);
    } // class Lab17
}