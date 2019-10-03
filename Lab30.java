import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Lab30 here.
 *
 * @author (Rose)
 * @version (03/10/2016)
 */
public class Lab30 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        while (!line.equals("#")){
            process(line);
            line = kb.nextLine();
        }
    }

    public static void process(String line){
        Scanner scn = new Scanner(line);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (scn.hasNextInt()){
            int num = scn.nextInt();
            nums.add(num);
        }
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++){
            int num = nums.get(i);
            if(i<nums.size()-1){
                System.out.print(num + " ");
            }else{
                System.out.println(num);
            } 
        }
     }
} // class Lab30
