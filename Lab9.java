import java.util.Scanner;
/**
 * Write a description of class Lab9 here.
 *
 * @author (Rose)
 * @version (08/08/2016)
 */
public class Lab9 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        double average = 0.00;
        int count = 0;
        num = kb.nextInt();
        while (num!=999){
            sum = sum +num;
            count =(count+1);
            num= kb.nextInt();
        }
        average= (double)sum/count;
        System.out.printf( "Sum: %d\n",sum);
        System.out.printf("Average: %.2f\n",average);

    } //main

} // class Lab9
