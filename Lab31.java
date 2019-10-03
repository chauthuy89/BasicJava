import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Lab31 here.
 *
 * @author (Rose)
 * @version (03/10/2016)
 */
public class Lab31 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        while(!line.equals("#")){
            nameSort(line);
            line = kb.nextLine();
        }
    } //main
    public static void nameSort(String line){
        Scanner scn = new Scanner(line);
        scn.useDelimiter(",");
        ArrayList<String> names = new ArrayList<String>();
        while (scn.hasNext()){
            String name = scn.next();
            names.add(name);
        }
        Collections.sort(names);
        if (line.length()>0){
            for(int i=0;i<names.size()-1;i++){
                System.out.print(names.get(i)+ ",");
            }
            System.out.println(names.get(names.size()-1));
        }
        else {
            System.out.println();
        }
       
    }
}

