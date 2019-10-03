import java.util.Scanner;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileReader;
/**
 * Write a description of class practice2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class practice2 {

    public static void main(String[] args) throws IOException {
         Scanner kb = new Scanner(System.in);
         HashMap<String,Double> elements = getData();
         String input = kb.nextLine();
         while (!input.equals("#")){
             Scanner scn = new Scanner(input);
             
             String element1 = scn.next();
             int quantity1 = scn.nextInt();
             double molecular1 = elements.get(element1);
             double total1 = quantity1*molecular1;
             
             String element2 = scn.next();
             int quantity2 = scn.nextInt();
             double molecular2 = elements.get(element2);
             double total2 = quantity2*molecular2;
             
             double total3 = total1+total2;
             System.out.printf("%.3f\n",total3);
             input = kb.nextLine();
            }
    } //main
    public static HashMap<String,Double> getData() throws IOException {
    Scanner fscn = new Scanner(new FileReader("C:/data/aa.txt"));
    HashMap<String,Double> elements = new HashMap<String,Double>();
    while (fscn.hasNextLine()){
    String line = fscn.nextLine();
    Scanner scn = new Scanner(line);
  
    String elem = scn.next();
    double quan = scn.nextDouble();
    elements.put(elem,quan);
    
    }
    return elements;
    }
} // class practice2
