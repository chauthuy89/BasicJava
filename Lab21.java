import java.util.Scanner;
/**
 * Write a description of class Lab21 here.
 *
 * @author (Rose)
 * @version (29/08/2016)
 */
public class Lab21 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        while (!s.equals("#")){
            sumLine(s);
            s = kb.nextLine();
        }
    } //main
    public static void sumLine(String numstr){
        Scanner scn = new Scanner(numstr);
        int sum = 0;
        int num = 0;
        while(scn.hasNext()){
            if(scn.hasNextInt()){
                num = scn.nextInt();
                sum += num;
            }else {
                scn.next();}

        }
        System.out.println(sum);
    } 
}
