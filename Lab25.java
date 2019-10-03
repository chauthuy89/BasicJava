import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class Lab25 here.
 *
 * @author (Rose)
 * @version (05/09/2016)
 */
public class Lab25 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        while (!line.equals("#")){
            getMedian(line);
            line = kb.nextLine();
        }

    } //main
    public static void getMedian(String line){
        Scanner scn = new Scanner(line);
        int gm = scn.nextInt(); 
        int [] numbers =new int [gm];

        for (int i =0; i<gm; i++){
            int num = scn.nextInt();
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        

        if (gm%2 ==1){ 
            System.out.printf("%.2f\n", (1.0*numbers[(gm/2)]));
        }
        else {
            double median = (numbers[gm/2] + numbers[(gm/2)-1])/2.0;
                
                System.out.printf("%.2f\n", median);
            }

        }
    } // class Lab25
