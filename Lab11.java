import java.util.Scanner;
/**
 * Write a description of class Lab11 here.
 *
 * @author (Rose)
 * @version (15/08/2016)
 */
public class Lab11 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        int count;
       while (!input.equals("#")){
        System.out.println(counter (input));
        input=kb.nextLine();
        }
    } //main
    public static int counter ( String input){
        int count = 0;
        for (int i=0;i<input.length();i++){
        char ch=input.charAt(i);
        if (ch=='*'){
            count++;
        }
        }
        return count;
    }
        
} // class Lab11
