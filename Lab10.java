import java.util.Scanner;
/**
 * Write a description of class Lab10 here.
 *
 * @author (Rose)
 * @version (09/08/2016)
 */
public class Lab10 {

    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         int num1 = 0;
         int num2 = 0;
         num2 = kb.nextInt();
       
         //System.out.println("Count to which number?");
         while (num1 <10){
             //System.out.println(num1);
            num1= num1+1;
            System.out.printf("%d times %d is %d",num1, num2, num1*num2);
            System.out.printf("\n");
            }
            
    } //main

} // class Lab10
