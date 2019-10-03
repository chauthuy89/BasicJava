import java.util.Scanner;
import java.util.HashMap;
/**
 * Write a description of class HashMapDemo here.
 *
 * @author (Rose)
 * @version (11/10)
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,String> phonebook = new HashMap<String,String>();
        Scanner kb = new Scanner(System.in);
        String phone = kb.nextLine();
        while(!phone.equals("#")){
            String person = phonebook.get(phone);
            System.out.println(person);
            phone = kb.nextLine();
        }
        phonebook.put("12345678","Kyla");
        phonebook.put("021532","Clarence");
        phonebook.put("42956789","Aaron");
        if(phonebook.containskey(phone)){
            String person = phonebook.get(phone);
            Ssytem.out.println(person);
        }
        else{
            System.out.println("Sorry, Entry not found");
        }
        phone = kb.nextLine();
    }
    public static HashMap<String,String> retrieveData(){
    HashMap<String,String> phonebook = new HashMap<String,String>();
    phonebook.put("21","Jarran");
    phonebook.put("82","Kelly");
    phonebook.put("021","Tri");
    return phonebook;
    }
} 


