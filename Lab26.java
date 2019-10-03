import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
/**
 * Write a description of class Lab26 here.
 *
 * @author (Rose)
 * @version (03/10/2016)
 */
public class Lab26 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String[]names = new String [num];
        kb.nextLine();
        for (int i=0;i<num;i++){
            names[i] = kb.nextLine();
        }
        Arrays.sort(names);
        for (int i=0; i<num;i++){
            System.out.println(names[i]);
        } //main
    }
} // class Lab26
