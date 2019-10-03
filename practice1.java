import java.util.Scanner;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileReader;
/**
 * Write a description of class practice1 here.
 *
 * @author (Rose)
 * @version (a version number or a date)
 */
public class practice1 {

    public static void main(String[] args) throws IOException{
        Scanner kb = new Scanner(System.in);
        HashMap<String,Integer> atomicSymbol = getData();
        
        //for (String k : atomicSymbol.KeySet()) {
         //   System.out.println("Key: " + k + "Value "  + atomicSymbol.get(k));
        //}
        
        String input = kb.nextLine();
        while (!input.equals("#")){
        Scanner scn = new Scanner(input);
       
       String element1 = scn.next();
        int quantity1 = scn.nextInt();
        int molecular1 = atomicSymbol.get(element1);
        int total1 = quantity1*molecular1;
        
        String element2 = scn.next();
        int quantity2 = scn.nextInt();
        int molecular2 = atomicSymbol.get(element2);
        int total2 = quantity2*molecular2;
        
        int total3 = total1+total2;
        System.out.printf("%d\n",total3);
        input = kb.nextLine();
        }
        }
   public static HashMap<String,Integer> getData() throws IOException {
    Scanner fscn = new Scanner(new FileReader("C:/data/final1.txt"));
    HashMap<String,Integer> map = new HashMap<String,Integer>();
  
   
   while (fscn.hasNextLine()){
    //String line = fscn.nextLine();
   
    Scanner scn = new Scanner(fscn.nextLine());
   
    String a = scn.next();
    int b = scn.nextInt();
    map.put(a,b);

    

     }
    
     return map;
    }
} // class practice1
