import java.util.Scanner;
/**
 * Write a description of class Lab14 here.
 *
 * @author (Rose)
 * @version (17/08/2016)
 */
public class Lab14 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input= kb.nextLine();
        int count;
        while (!input.equals("#")){
            System.out.println(counter(input));
            input = kb.nextLine();
        } //main
    }

    public static int counter(String input){
        int count=0;
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='i'){;
                count++;
            }
        }
        return count;
    }
}