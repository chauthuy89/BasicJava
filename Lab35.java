import java.util.Scanner;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class Lab35 here.
 *
 * @author (Rose)
 * @version (17/10/2016)
 */
public class Lab35 {

    public static void main(String[] args) throws IOException {
        HashMap<String,String> phoneLists= getList();
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        while(!input.equals("#")){
            phonecontact(phoneLists,input);
            input = kb.nextLine();
        }
    } //main
    public static void phonecontact(HashMap<String,String> phoneLists, String input){

        if( phoneLists.containsKey(input)){
            // String names = phoneLists.get(phonecontacts);
            System.out.printf("%s %s\n",input, phoneLists.get(input));
        }
        else {
            System.out.printf("%s Unknown\n",input);
        }
    }

    public static HashMap<String,String> getList() throws IOException{
        Scanner fscn = new Scanner(new FileReader("data/phonelist.txt"));
        HashMap<String,String> phoneLists = new HashMap<String,String>();
        while(fscn.hasNextLine()){
            String number = fscn.next();
            String name = fscn.nextLine();
            phoneLists.put(number,name);
        }
        fscn.close();
        return phoneLists;
    }
} // class Lab35
