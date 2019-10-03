import java.util.Scanner;
/**
 * Write a description of class Lab5 here.
 *
 * @author (Rose)
 * @version (version 1)
 */
public class Lab5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String product = kb.nextLine();
        double price = kb.nextDouble();
        int quantity = kb.nextInt();
        getTotal(product,price,quantity);

    } //main
    public static void getTotal(String p, double pr, int q) {
        System.out.printf("%d x %s @ $%.2f%n", q, p, pr);
        
        if (q < 10){
            System.out.printf("Total: $%.2fn", q*pr);
        }
        else{
            System.out.printf("Subtotal: $%.2f\n", q*pr);
            System.out.printf("-10%% Discount: $%.2f\n", (0.1*q*pr));
            System.out.printf("Total: $%.2f\n", (0.9*q*pr));
        }
    } 
}
