import java.util.Scanner;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Write a description of class Lab38 here.
 *
 * @author (Rose)
 * @version (19/102016)
 */
public class Lab38 {

    public static void main(String[] args) throws IOException{
        Scanner kb = new Scanner(System.in);
        HashMap<String,Integer> distances = getList();
        ArrayList<String> options = new ArrayList<String>();
        String input;
        int limit = kb.nextInt();
        kb.nextLine();
        while(!(input=kb.nextLine()).equals("#")){
            options.add(input);
        }
        getTotal(limit, distances, options);
        
    } //main
    public static  HashMap<String,Integer> getList() throws IOException{
        Scanner fr = new Scanner(new FileReader("travel.txt"));
        HashMap<String,Integer> distances = new HashMap<String,Integer>();
        while (fr.hasNextLine()){
            Scanner line = new Scanner(fr.nextLine());
            line.useDelimiter(",");
            String places = line.next();
            int distance = line.nextInt();
            distances.put(places,distance);
        }
        return distances;
    }
    public static void getTotal(int limit, HashMap<String,Integer> distances, ArrayList<String> options){
        for( String in : options){
            Scanner scn = new Scanner(in);
            scn.useDelimiter(",");
            int total = 0;
            while(scn.hasNext()){
                String trip = scn.next();
                int dist = distances.get(trip);
                total+= dist;
            }
            if(total< limit){
                System.out.printf("%s %dkm\n", in, total);
            }
        }
    }
} // class Lab38
