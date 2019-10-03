import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Lab28 here.
 *
 * @author (Rose)
 * @version (03/10/2016)
 */
public class Lab28 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<String> nums = new ArrayList<String>();
        String num = kb.nextLine();
        while (!num.equals("-1")){
            nums.add(num);
            num = kb.nextLine(); 
        }
        Collections.sort(nums);
        for( int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        } //main
    }
    } // class Lab28
