import java.util.Scanner;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
/**
 * Write a description of class Lab37 here.
 *
 * @author (Rose)
 * @version (16/10/2016)
 */
public class Lab37 {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        HashMap<String,Integer> foods = getData();
        String input = kb.nextLine();
        while(!input.equals("#")){
            Scanner scn = new Scanner(input);
            scn.useDelimiter("[,:]");
            
            String f1 = scn.next();
            int q1 = scn.nextInt();
            int c1 = foods.get(f1);
            int total1 = q1*c1;
            
            String f2 = scn.next();
            int q2 = scn.nextInt();
            int c2 = foods.get(f2);
            int total2 = q2*c2;
            
            if(total1<total2){
                System.out.printf("%s,%d,%d\n",f1,q1,total1);
            } else if (total1>total2){
                System.out.printf("%s,%d,%d\n",f2,q2,total2);
            }else {
                System.out.printf("Same Value\n");
            }
            input = kb.nextLine();
        }
    } //main
   public static HashMap<String,Integer> getData() throws IOException{
       Scanner fscn = new Scanner(new FileReader("diet.txt"));
       HashMap<String,Integer> foods = new HashMap<String,Integer>();
       while (fscn.hasNextLine()){
           String line = fscn.nextLine();
           Scanner scn = new Scanner(line);
           scn.useDelimiter("\t");
           String food = scn.next();
           int cal = scn.nextInt();
           foods.put(food,cal);
        }
        return foods;
    }
} // class Lab37
