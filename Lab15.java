import java.util.Scanner;
/**
 * Write a description of class Lab15 here.
 *
 * @author (Rose)
 * @version (17/08/2016)
 */
public class Lab15 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input =kb.nextLine().toLowerCase();
       
        while (!input.equals("#")){
            counter(input);
            input = kb.nextLine().toLowerCase();
        }
    } //main
    public static void counter(String input){
        int acount = 0;
        int ecount= 0;
        int icount = 0;
        int ocount = 0;
        int ucount = 0;
        for (int i=0; i <input.length();i++){
            switch (input.charAt(i)){
                case 'a':
                acount++;
                break;
                case 'e':
                ecount++;
                break;
                case 'i':
                icount++;
                break;
                case 'o':
                ocount++;
                break;
                case 'u':
                ucount++;
                break;
            }
        }
        System.out.printf("a:%d,e:%d,i:%d,o:%d,u:%d\n",acount,ecount,icount,ocount,ucount);
        
    }
}//
