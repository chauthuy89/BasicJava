import java.util.Scanner;
import java.util.HashMap;

import java.io.IOException;
import java.io.FileReader;
/**
 * Write a description of class Finalexam here.
 *
 * @author (Rose)
 * @version (31/10/2016)
 */
public class practice {

    public static void main(String[] args) throws IOException{
        Scanner kb = new Scanner(System.in);
        HashMap<String,Double> atomicSymbol = getData();
        String input = kb.nextLine();
        while( !input.equals("#")){
            Scanner scn = new Scanner(input);
            scn.useDelimiter(" ");
            
            String element1 = scn.next();
            int quantity1 = scn.nextInt();
            double molecular1 = atomicSymbol.get(element1);
            double total1 = quantity1*molecular1;
            
            String element2 = scn.next();
            int quantity2 = scn.nextInt();
            double molecular2 = atomicSymbol.get(element2);
            double total2 = quantity2* molecular2;
            
           double total3 = total1+total2;
           System.out.printf("%.3f\n",total3);
           input = kb.nextLine();
        }
            
        
    } //main
    public static HashMap<String,Double> getData() throws IOException{
    Scanner fscn = new Scanner(new FileReader("C:/data/atomic.txt"));
    HashMap<String,Double> map = new HashMap<String,Double>();
    while (fscn.hasNext()){
        String line = fscn.nextLine();
        Scanner scn = new Scanner(line);
        String atomic = scn.next();
        double quantity = scn.nextDouble();
        map.put(atomic,quantity);
    }
    return map;
    }
} // class Finalexam
