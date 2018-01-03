import java.util.*;
public class day2Part2 {
    public static void main(String[] args) {
        int check_sum = 0;
        int quotient = 0;
        Scanner input = new Scanner(System.in);
        
        while(input.hasNextLine()) {
            String line = input.nextLine();
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            String[] sequence = line.split("\\s+");
        
            for(int i = 0; i < sequence.length; i++) {
                numbers.add(Integer.parseInt(sequence[i]));
            }
            //Check if numbers[i] % numbers[j] = 0 (numbers[i]/numbers[j] is evenly divisible)
            for(int i = 0; i < numbers.size() - 1; i++) {
                for(int j = i + 1; j < numbers.size(); j++) {
                    if(numbers.get(i) % numbers.get(j) == 0 && (i != j)) {
                        quotient = numbers.get(i) / numbers.get(j);
                        System.out.println("ij: " + quotient);
                        check_sum = check_sum + quotient;
                    }
                }
            }
            //Check if numbers[i] % numbers[j] = 0 (numbers[j]/numbers[i] is evenly divisible)
            for(int i = 0; i < numbers.size() - 1; i++) {
                for(int j = i + 1;j < numbers.size(); j++) {
                    if((numbers.get(j) % numbers.get(i) == 0) && (i != j)) {
                        quotient = numbers.get(j) / numbers.get(i);
                        System.out.println("ji: " + quotient);
                        check_sum = check_sum + quotient;
                    }
                }
            }

            
        }
        System.out.println("Checksum: " +  check_sum);
        



    }
}