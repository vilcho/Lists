
import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;

/**
 * Created by Vilcho on 6/20/2017.
 */
public class Lab_o04_SplitByWordCasing {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split(",|;|:|\\.|!|\\(|\\)|\\\\|/|\\[|]|\\s+|[']|\"")).collect(Collectors.toList());

        text = emptyElementsCleaner(text);

        List<String> lowerCaseWords = new ArrayList<String>();
        List<String> upperCaseWords = new ArrayList<String>();
        List<String> mixedCaseWords = new ArrayList<String>();

        for (String word : text) {
            char[] letters = word.toCharArray();
            
            int lowerCount = 0;
            int upperCount = 0;
     
             for (int i = 0; i < letters.length; i++) {
                 if (letters[i] >= 65 && letters[i] <= 90){
                     upperCount++;
                 } else if(letters[i] >= 97 && letters[i] <= 122){
                     lowerCount++;
                 } 
             }
             if(lowerCount == letters.length){
                 lowerCaseWords.add(word);
             } else if(upperCount == letters.length){
                 upperCaseWords.add(word);
             } else {
                 mixedCaseWords.add(word);
             }
         }
   
            
        System.out.println("Lower-case: " + String.join(", ", lowerCaseWords));
        System.out.println("Mixed-case: " + String.join(", ", mixedCaseWords));
        System.out.println("Upper-case: " + String.join(", ", upperCaseWords));

    }


    static List<String> emptyElementsCleaner(List<String> someArrayListToBeCleaned) {
        List<String> cleanedText = new ArrayList<String>();

        for (String word : someArrayListToBeCleaned) {
            if (!word.isEmpty()) {
                cleanedText.add(word);
            }
        }
        return cleanedText;
    }
        
 

}
