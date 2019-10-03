import java.util.Scanner;
/**
 * Write a description of class Lab24 here.
 *
 * @author (Rose)
 * @version (05/09/2016)
 */
public class Lab24 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        while (!s.equals("#")){
            output(s);
            s = kb.nextLine();
        }
    } //main
    public static void output(String s){
        Scanner scn = new Scanner(s);
        int max = 0;
        int min = 0;
        int num = scn.nextInt();
        min = max = num;
        while (scn.hasNextInt()){
            int num2 = scn.nextInt();
            if (num2<min){
                min = num2;
            }
            if (num2>max){
                max = num2;
            }

        }
        System.out.printf("Min: %d Max: %d\n",min,max);
    }
} // class Lab24
