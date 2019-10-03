import java.util.Scanner;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException; 
public class Lab40 {
    public static void main (String[]args) throws IOException{
        Scanner kb = new Scanner(System.in);
        HashMap<String, String> morsecode = getMorseCode();
        String input = kb.nextLine();
        while (!input.equals("#")){
            morseCodeGenerator(input,morsecode);
            input = kb.nextLine();
        }
    }

    public static void morseCodeGenerator (String input, HashMap<String, String> morsecode){
        for (int i=0; i<input.length();i++){ 
            String character = input.charAt(i) + "";
            if (character.equals(" ")){
                System.out.print("   ");
            }else {
                if(i == input.length() - 1) {
                    System.out.print(morsecode.get(character.toUpperCase()));
                } else {
                    System.out.print(morsecode.get(character.toUpperCase()) + " ");
                }
            }
        }
        System.out.print("\n"); 
    }
  
    public static HashMap<String, String> getMorseCode() throws IOException{
        HashMap<String, String> morseCode = new HashMap<String, String>();
        Scanner fscn = new Scanner (new FileReader("/data/morsecode.txt"));
        while (fscn.hasNextLine()){
            String line = fscn.nextLine();
            Scanner fs = new Scanner(line);
            fs.useDelimiter(" ");
            String key = fs.next();
            String value = fs.next();
            morseCode.put(key, value);
        }
        return morseCode;
    }
}
