import java.util.Scanner;
/**
 * Write a description of class Lab14 here.
 *
 * @author (Rose)
 * @version (15/08/1/2016)
 */
public class Lab13 {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String input = kb.nextLine();
        String output;
        while (!input.equals("#")){
        System.out.println(backwards(input));
        input = kb.nextLine();
       
        }
    } //main
    public static String backwards(String input){
        String output="";
        for( int i=input.length()-1;i>=0;i--){
        
        output = output+input.charAt(i);                                                                                                           
    }
    return output;
} 
}
