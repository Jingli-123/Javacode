import java.util.*;
public class Palindromes {
    public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    System.out.print("Enter a word:");
    String word = keyboard.nextLine();
    String new_word =  "";
    int i;
    for (i = word.length() - 1; i >= 0; i--) {
        new_word = new_word + word.charAt(i);
        
        }
    System.out.println("The palindromes of word will be: " + new_word);  
    
    }
}