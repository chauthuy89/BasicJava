import java.util.Scanner;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class Lab36 here.
 *
 * @author (Rose)
 * @version (18/10/2016)
 */
public class Lab36 {

    public static void main(String[] args) throws IOException{
       HashMap<String,String> numberplates = getData();
        Scanner kb= new Scanner(System.in);
       String input = kb.nextLine();
       while (!input.equals("#")){
           if (numberplates.containsKey(input)){
               System.out.println(numberplates.get(input));
            }
            else{
                System.out.println("Unregistered Car");
            }
            input = kb.nextLine();
            
        }
    } //main
    public static HashMap<String,String> getData() throws IOException{
        Scanner fscn = new Scanner(new FileReader("numberplates.txt"));
        HashMap<String,String> numberplates = new HashMap<String,String>();
        while (fscn.hasNext()){
            String line = fscn.nextLine();
            Scanner sca = new Scanner(line);
            sca.useDelimiter(":");
            String plate = sca.next();
            String name = sca.next();
            numberplates.put(plate,name);
        }
        return numberplates;
    }
} // class Lab36
