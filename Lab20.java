import java.util.Scanner;
/**
 * Write a description of class Lab20 here.
 *
 * @author (Rose)
 * @version (29/08/2016)
 */
public class Lab20 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();

        while(!s.equals("#")) {
            sumLine(s);
            s= kb.nextLine();

        }
    } //main
    public static void sumLine(String nums){
        Scanner scn = new Scanner(nums);
        int sum = 0;
        while (scn.hasNextInt()){
            int num = scn.nextInt();
            sum = sum + num;
        }
        System.out.printf("%d\n",sum);
    }
} // class Lab20
