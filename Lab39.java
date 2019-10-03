import java.util.Scanner;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;


/**
 * Write a description of class Lab39 here.
 *
 * @author (Rose)
 * @version(19/10/2016)
 */
public class Lab39 {

    public static void main(String[] args)throws IOException {
         HashMap<String,Double> map = getPrice();
         Scanner kb = new Scanner(System.in);
         double total = 0;
         String input = kb.nextLine();
         while(!input.equals("#")){
          Scanner line = new Scanner(input);
          while(line.hasNext()){
              String item = line.next();
              int quantity = line.nextInt();
              double price = map.get(item);
              total+= quantity*price;
            }
            System.out.printf("$%.2f\n", total);
             total = 0;
            input = kb.nextLine();
           
        }
    } //main
   public static HashMap<String,Double> getPrice() throws IOException{
       Scanner fscn = new Scanner(new FileReader("pricelist.txt"));
       HashMap<String,Double>map = new HashMap<String,Double>();
       while (fscn.hasNextLine()){
           String fr = fscn.nextLine();
           Scanner scn = new Scanner(fr);
           String item = scn.next();
           double price = scn.nextDouble();
           map.put(item,price);
        }
        return map;
    }
           
} // class Lab39
