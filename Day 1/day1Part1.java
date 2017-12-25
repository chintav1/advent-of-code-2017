import java.util.*;


public class day1Part1 {
    
    
    public static void main(String[] args) {
        int total = 0;
       
        
        Scanner input = new Scanner(System.in);
        String all_digits = input.next();
        String[] digits = all_digits.split("");
        Integer[] integer_digits = new Integer[digits.length];

        for(int i = 0; i < digits.length; i++) {
            integer_digits[i] = Integer.parseInt(digits[i]);
        }

       
        for(int i = 0; i < integer_digits.length - 1; i++){
            if(integer_digits[i] == integer_digits[i + 1]) {
                total = total + integer_digits[i];
            }
        }
        if(integer_digits[0] == integer_digits[integer_digits.length - 1]) {
            total = total + integer_digits[0];
        }
        
        System.out.println(total);
    
    }
}