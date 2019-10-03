import java.util.Scanner;

/**
 * Write a description of class Lab18 here.
 *
 * @author (Rose)
 * @version (29/08/2016)
 */
public class Lab18 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        while (!line.equals("#")){
            process(line);
            line = kb.nextLine();
        }
    } //main
    public static void process(String line){
        Scanner scn = new Scanner(line);
        String s = scn.next();
        if (s.equals("S")){
            double a = scn.nextDouble();
            System.out.printf("%.1f\n",a*a);
        }
        else if (s.equals("R")){
            double length = scn.nextDouble();
            double height = scn.nextDouble();
            System.out.printf("%.1f\n",length*height);
        }
        else if (s.equals("T")){
            double lengtH = scn.nextDouble();
            double heighT = scn.nextDouble();
            System.out.printf("%.1f\n",0.5*lengtH*heighT);
        }
        else if (s.equals("C")){
            double b = scn.nextDouble();

            System.out.printf("%.1f\n",b*b*3.1415);
        } 
    }
}
