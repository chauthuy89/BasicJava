
import java.util.Scanner;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileReader;
/**
 * Write a description of class PreciousGem here.
 *
 * @author (Rose)
 * @version (17/10/2016)
 */
public class PreciousGem {

    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> gems = getGerms();
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        while(!input.equals("#")){
            Scanner scr = new Scanner(input);
            String gem1 = scr.next();
            int quant1 = scr.nextInt();
            String gem2 = scr.next();
            int quant2 = scr.nextInt();
            int val1 = gems.get(gem1);
            int val2 = gems.get(gem2);
            System.out.printf("%d gp\n",val1*quant1 + val2*quant2);
            input = kb.nextLine();
        }
    } //main
    /**
     * Read text file of gemstones and return map of gems and prices
     * @ return HashMap of gems keyed by prices
     */
    public static HashMap<String,Integer> getGerms() throws IOException{
        Scanner filescanner = new Scanner(new FileReader("C:/data/gems.txt"));
        HashMap<String,Integer> gems = new HashMap<String,Integer>();
        while (filescanner.hasNext()){
            String line = filescanner.nextLine();
            //System.out.println(line);
            Scanner scn = new Scanner(line);
            scn.useDelimiter(":");
            String gem = scn.next();
            int price = scn.nextInt();
            gems.put(gem,price);
        }
        filescanner.close();
        return gems;
    }
} // class PreciousGem
