import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Lab27 here.
 *
 * @author (Rose)
 * @version (03/10/2016)
 */
public class Lab27 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<Double>();
        String line = kb.nextLine();
        double ave = 0.0;
        while (!line.equals("-1")){
            double num = Double.parseDouble(line);
            nums.add(num);
            ave = ave + num;
            line = kb.nextLine();

        }
        ave = ave/nums.size();
        for( int i = 0;i<nums.size();i++){
            if (nums.get(i)<ave){
                System.out.printf("%.2f BELOW AVERAGE\n", nums.get(i));
            }else if (nums.get(i)>ave){
                System.out.printf("%.2f ABOVE AVERAGE\n", nums.get(i));
            } else {
                System.out.printf("%.2f AVERAGE\n", nums.get(i));
            }
        }
    } //main

} // class Lab27
