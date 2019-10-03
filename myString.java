import java.util.Scanner;
/**
 * Write a description of class myString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myString {

    public static void main(String[] args) {
      
       String myString;
       myString = "this IS a string";
       System.out.println(myString+" today ");
       System.out.println(myString+2+3  );
       System.out.println(myString+(2+3)  );
       System.out.println(myString+"\ntoday ");
       System.out.println(myString.length()  );
       System.out.println(myString.toLowerCase( ) );
       System.out.println(myString.substring(3,5) );
       System.out.println(myString.equals("this is a string") );
       System.out.println(myString.equalsIgnoreCase("this is a string"));
       System.out.println(myString.compareTo("vagabond") );
       System.out.println(myString.compareTo("anaconda") );
       System.out.println(myString.compareTo("this Is a string") );
       System.out.println(myString.replace('t','x') );
       System.out.println(myString.charAt(0) );
       System.out.println(myString.charAt(10) );
       System.out.println(myString.indexOf("I") );
       System.out.println(myString.indexOf("string") );
       System.out.println(myString.indexOf("String") );
         System.out.println(myString.startsWith("string") );
           System.out.println(myString.endsWith("string") );
                  
    } //main

} // class myString
;