import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
/**
 * Write a description of class Lab33 here.
 *
 * @author (Rose)
 * @version (11/10/2016)
 */
public class Lab33 {

    public static void main(String[] args) throws IOException {
        Scanner kb =  new Scanner(System.in);
        ArrayList<String> nameList = getNames("names.txt");
        String input = kb.nextLine();
        while (!input.equals("#")){
            int count = 0;
            for (String name : nameList){
                if (name.contains(input)){
                    count++;
                }
            }
            System.out.printf("%s: %d\n",input,count);
            input = kb.nextLine();
        }
    } //main
    public static ArrayList<String> getNames(String filename) throws IOException{
        ArrayList<String> nameList = new ArrayList<String>();
        Scanner fscn = new Scanner(new FileReader(filename));
        while (fscn.hasNextLine()){
            String line = fscn.nextLine();
            nameList.add(line);
        }
        return nameList;
    }
} // class Lab33
