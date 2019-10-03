import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class NamesToLookup here.
 *
 * @autho Rose
 * @version (12/10/2016)
 */
public class Lab34 {

    public static void main(String[] args) throws IOException {
        HashMap<String,Double> items = getData("priceList.txt");
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        while (!line.equals("#")){
            shoppingList(line,items);
            line = kb.nextLine();
        }

    }
    public static void shoppingList(String line,HashMap<String,Double> items){
        String[] array = line.split(" ");
        String item = array[0];
        int quantity = Integer.parseInt(array[1]);
        if(items.containsKey(item)){
            double price = items.get(item);
            double total = quantity*price;
            System.out.printf("%s %d@$%.2f $%.2f\n", item,quantity,price, total);
        } else {
            System.out.printf("%s Not available\n", item);
        }
     }
    
    public static HashMap<String,Double> getData(String filename) throws IOException {
        HashMap<String,Double> items = new HashMap<String,Double>();

        Scanner fscn = new Scanner(new FileReader(filename));
        while (fscn.hasNextLine()){
            String line = fscn.nextLine();
            Scanner scn = new Scanner(line);
            scn.useDelimiter(" ");
            String item = scn.next();
            double price = scn.nextDouble();
            items.put(item,price);
        }
        fscn.close();
        return items;
    } //getData


} // class NamesToLookup