import java.util.Scanner;
/**
 * Write a description of class Lab8 here.
 *
 * @author (Rose)
 * @version (08/08/2016)
 */
public class Lab8 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        while (num !=-1) {
            printGrade(num);
            num= kb.nextInt();
        }
    }//main
    /**
     * Given a mark between 0 and 100, output Pass, Fail or Merit
     * @param mark The mark to grade
     */
    public static void printGrade(int mark){

        if (mark<50){
            System.out.println("FAIL");

        }
        else if (mark>= 50 && mark<80){
            System.out.println("PASS");

        }
        else {

            System.out.println("MERIT");

        }
    }
}//class Lab8

