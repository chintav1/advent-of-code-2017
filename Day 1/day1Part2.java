import java.util.*;


public class day1Part2 {
    
    
    public static void main(String[] args) {
        int total = 0;
       
        
        Scanner input = new Scanner(System.in);
        String all_digits = input.next();
        String[] digits = all_digits.split("");
        Integer[] integer_digits = new Integer[digits.length];

        for(int i = 0; i < digits.length; i++) {
            integer_digits[i] = Integer.parseInt(digits[i]);
        }

        
        for(int i = 0; i < integer_digits.length; i++) {
            int new_index = (i + integer_digits.length/2) % integer_digits.length;
            //System.out.println(i);
            // System.out.println(new_index);

            if(integer_digits[i] == integer_digits[new_index]) {

                total = total + integer_digits[i];
            }
        }
      /* int i = 0;
        while(i != integer_digits.length/2) {
            if(integer_digits[i] == integer_digits[i + integer_digits.length/2]) {
                total = total + integer_digits[i];
            }
            i++;
        }*/
        
        
        System.out.println(total);
    
    }
}