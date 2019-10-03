import java.util.Scanner;
/**
 * Write a description of class Shopping here.
 *
 * @author (Rose)
 * @version (a version 1)
 */
public class Lab3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String item = kb.nextLine();
        double price = kb.nextDouble();
        int quantity = kb.nextInt();

        System.out.printf("%d x %s @ $%.2f Total: $%.2f\n ", quantity,item,price,quantity*price);
    } //main
} // class Shopping
