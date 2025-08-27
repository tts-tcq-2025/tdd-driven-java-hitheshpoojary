import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0; 
        }

        String delimiter = ",|\n";
        String numbers = input;

        // Custom delimiters (single or multi-character)
        if (numbers.startsWith("//")) {
            if (numbers.startsWith("//[")) {
                int end = numbers.indexOf("]\n");
                delimiter = Pattern.quote(numbers.substring(3, end));
                numbers = numbers.substring(end + 2);
            } else {
                delimiter = Pattern.quote(numbers.substring(2, 3));
                numbers = numbers.substring(4);
            }
        }

        String[] tokens = numbers.split(delimiter);
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;

        for (String token : tokens) {
            if (token.trim().isEmpty()) continue;
            int num = Integer.parseInt(token.trim());
            if (num < 0) {
                negatives.add(num);
            } else if (num <= 1000) { // TC-08
                sum += num;
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negatives); // TC-10
        }

        return sum;
    }
}
