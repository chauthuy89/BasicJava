import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileReader;
import java.io.IOException;
/**
 * Write a description of class Lab32 here.
 *
 * @author (Rose)
 * @version (11/10/2016)
 */
public class Lab32 {

    public static void main(String[] args) throws IOException{
         Scanner fscn = new Scanner(new FileReader("raw.txt"));
         while(fscn.hasNextLine()){
             String line = fscn.nextLine();
             output(line);
            }
    } //main
    public static void output(String line) throws IOException{
    Scanner newLine = new Scanner(line);
    String name = newLine.next();
    ArrayList<Integer> nums = new ArrayList<Integer>();
    while (newLine.hasNextInt()){
    nums.add(newLine.nextInt());
    }
    Collections.sort(nums, Collections.reverseOrder());
    System.out.printf("%s", name);
    for (int i= 0; i <3; i++){
        System.out.printf(" %d", nums.get(i));
    }
    System.out.println();
    }
} // class Lab32
