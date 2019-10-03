import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Lab29 here.
 *
 * @author (Rose)
 * @version (03/10/2016)
 */
public class Lab29 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String name = kb.nextLine();
        while (!name.equals("#")){
            names.add(name);
            name = kb.nextLine();

        }
        Collections.sort(names);
        for(int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }
    } //main

} // class Lab29
