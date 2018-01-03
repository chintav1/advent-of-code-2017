import java.util.Scanner;

public class day4Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int valid_phrases = 0;

        while(input.hasNextLine()) {
            boolean valid = true;
            String pass_phrase = input.nextLine();
            String[] words = pass_phrase.split(" ");
            
            //check for duplicate words
            for(int i = 0; i < words.length - 1; i++) {
                for(int j = i + 1; j < words.length; j++) {
                    if(words[i].equals(words[j])) {                     
                        valid = false;                                  //if there are duplicates, invalid
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