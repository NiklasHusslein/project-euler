package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class PE2_Fibonacci {

    /**
     * Gibt die Summe aller geraden Fibonacci-Zahlen bis zu einer bestimmten Zahl aus.
     */
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);

        int sum = 0;

        for(int i = 2; numbers.get(i-1) < 4000000; i++) {
            numbers.add(numbers.get(i-1) + numbers.get(i-2));
        }

        for(int j = 1; j < numbers.size(); j++) {
            if(numbers.get(j) % 2 == 0) {
                sum = sum + numbers.get(j);
            }
        }

        System.out.println(sum);

    }
}
