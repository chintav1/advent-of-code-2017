import java.util.Arrays;
import java.util.Scanner;

public class day4Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int valid_phrases = 0;

        while(input.hasNextLine()) {
            boolean valid = true;
            String pass_phrase = input.nextLine();
            String[] words = pass_phrase.split(" ");
            
            
            //check if any two words are the same if rearranged
            for(int i = 0; i < words.length - 1; i++) {
                char[] characters1 = words[i].toCharArray();
                Arrays.sort(characters1);
                for(int j = i + 1; j < words.length; j++) {
                    char[] characters2 = words[j].toCharArray();
                    Arrays.sort(characters2);
                    //if two words are the same length and contain the same characters, invalid
                    if((characters1.length == characters2.length) && (Arrays.equals(characters1, characters2))) {                     
                        valid = false;
                    }
                 
                }
            }

            if(valid == false) {                                        //if invalid, go to next phrase
                continue;
            }

            if(valid == true) {
                System.out.println(pass_phrase + " is VALID");
                valid_phrases++;
            }

            words = null;

        }

        System.out.println("Number of valid phrases = " + valid_phrases);


        
    }
}