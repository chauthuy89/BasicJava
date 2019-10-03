import java.util.Scanner;
/**
 * Write a description of class Lab23 here.
 *
 * @author (Rose)
 * @version (29/08/2016)
 */
public class Lab23 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();

        while(!line.equals("#")){
            counter(line);
            line = kb.nextLine();
        }
    } //main
    public static void counter(String line){
        int acount = 0;
        int bcount = 0;
        for (int i=0;i<line.length();i++){
            switch(line.charAt(i)){
                case 'A':
                acount++;
                break;
                case 'B':
                bcount++;
                break;
            }
        }
        System.out.printf("A %d B %d\n",acount,bcount);
    } 
}