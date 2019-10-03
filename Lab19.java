import java.util.Scanner;
/**
 * Write a description of class Lab19 here.
 *
 * @author (Rose)
 * @version (29/08/2016)
 */
public class Lab19 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        while(!s.equals("#")){
            arrange(s);
            s = kb.nextLine();
        }
    } //main
    public static void arrange(String s){
        Scanner scn = new Scanner(s);
        scn.useDelimiter("\\s");
        String name1 = scn.next();
        int num1 = scn.nextInt();
        String name2 = scn.next();
        int num2 = scn.nextInt();
        if(num1>=num2){
            System.out.printf("%s %d %s %d\n",name1,num1,name2,num2);
        }else{
            System.out.printf("%s %d %s %d\n",name2,num2,name1,num1);

        }
    }
} // class Lab19
