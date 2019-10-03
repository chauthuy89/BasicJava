import java.util.Scanner;
import java.util.HashMap;


/**
 * Write a description of class MapDemo here.
 *
 * @author Ken
 * @version 0.1 alpha
 */
public class MapDemo {

    public static void main(String[] args) {
         HashMap<String,String> addresses = getData();
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter people's names and I will give you their address (end with an empty line)");
         String name = kb.nextLine();
         while (! name.equals("")){
             if (addresses.containsKey(name)) {
                 String address = addresses.get(name);
                 System.out.printf("The address of %s is %s\n",name,address);
             }
             else {
                 System.out.println("We dont have that address");
             }
             name = kb.nextLine();
         }
         
    } //main
    
    /**
     * Get the data for the HashMap
     * @return the populated HashMap
     */
    public static HashMap<String,String> getData(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Cristoper","Ummm");
        map.put("Holly","59 Pancake Street");
        map.put("Pam","555 Strawberry Road");
        return map;
    }

} // class MapDemo
