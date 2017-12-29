import java.util.*;
public class day2Part1 {
    public static void main(String[] args) {
        int check_sum = 0;
        Scanner input = new Scanner(System.in);
        
        while(input.hasNextLine()) {
            String line = input.nextLine();
            ArrayList<Integer> numbers = new ArrayList();
            String[] sequence = line.split("\\s+");
        
            for(int i = 0; i < sequence.length; i++) {
                numbers.add(Integer.parseInt(sequence[i]));
            }
            Integer max = Collections.max(numbers);
            Integer min = Collections.min(numbers);
            int difference = max - min;
            check_sum = check_sum + difference;

            
        }
        System.out.println(check_sum);
        



    }
}