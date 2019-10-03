import java.util.Scanner;
/**
 * Write a description of class Lab41 here.
 *
 * @author (Rose)
 * @version (16/10/2016)
 */
public class Lab41 {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String input = kb.nextLine();
        while(!input.equals("#")){
            CsvFiles(input);
            input = kb.nextLine();
        }
    } //main
    public static void CsvFiles (String input){
        boolean file = false;
        for(int i=0; i<input.length();i++){
            if (input.charAt(i)=='\"'){
                file = !file;
            }
            if (input.charAt(i)==',' && file == false){
                System.out.printf(";");
            }
            else {
                System.out.print(input.charAt(i));
            }
        }
      }
} // class Lab41
