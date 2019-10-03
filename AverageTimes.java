import java.util.Scanner;


/**
 * Write a description of class AverageTimes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AverageTimes {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double total= 0;
        double average;
        System.out.println("How many times will be supplied");
        int size = kb.nextInt();
        double[] time = new double[size];
                
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter time %d:",i);
            time[i] = kb.nextDouble();            
            total += time[i];
        }
        
        average = total / size;
        
        for (int i = 0; i < size; i++) {
            printResult(time[i],average);
        }

    } //main
    
    public static void printResult(double time, double average){
        if (time < average) {
            System.out.printf("%.1f Below Average\n",time);
        }
        else if (time > average) {
            System.out.printf("%.1f Above Average\n",time);            
        }
        else {
            System.out.printf("%.1f Average\n",time);            
        }
    }

} // class AverageTimes
