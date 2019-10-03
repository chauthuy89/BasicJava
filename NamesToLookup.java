import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class NamesToLookup here.
 *
 * @author Ken Sutton
 * @version (a version number or a date)
 */
public class NamesToLookup {

    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> ages = getData("ages.txt");
        queryData(ages);
    }
     
    /**
     * Read name and age data from data file
     * @param String filename The name of the file to read
     * @return The HashMap of names and ages
     */
    public static HashMap<String,Integer> getData(String filename) throws IOException {
        HashMap<String,Integer> ages = new HashMap<String,Integer>();
        
        Scanner fscn = new Scanner(new FileReader(filename));
        while (fscn.hasNextLine()){
            String line = fscn.nextLine();
            Scanner scn = new Scanner(line);
            scn.useDelimiter(",");
            String name = scn.next();
            int age = scn.nextInt();
            ages.put(name,age);
        }
        fscn.close();
        return ages;
    } //getData
        
    /**
     * Query map for ages
     * @param int ages  The HashMap containing names and ages
     */
    public static void queryData(HashMap<String,Integer> ages) {    
        Scanner kb = new Scanner(System.in);
        System.out.printf("Data Entry complete - %d names found\n",ages.size());
        System.out.println("Please enter a name (# to end)");
        String name = kb.nextLine();
        while (!name.equals("#")){
            if (ages.containsKey(name)){
                int age = ages.get(name);
                System.out.printf("The age of %s is %d\n",name,age);
            }
            else {
                System.out.println(name + " who???");
            }
            System.out.println("Please enter a name (# to end)");
            name = kb.nextLine();
        }
        
    } //queryData

} // class NamesToLookup