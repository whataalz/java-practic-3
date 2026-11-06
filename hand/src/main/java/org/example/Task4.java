package org.example;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4,2,7,2,9,4,1,7,3,9));
        System.out.println(numbers);

        List<Integer> unique = new ArrayList<>();
        for (int number : numbers) {
            if (!unique.contains(number)) {
                unique.add(number);
            }
        }
        System.out.println(unique);

        for (int uniqueNum : unique) {
            int count = 0;
            for (int number : numbers) {
                if (number == uniqueNum) {
                    count++;
                }
            }
            System.out.println(uniqueNum + " - " + count + "  raza");
        }
        int max = numbers.get(0);
        int min = numbers.get(0);
        int sum = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            sum = sum + number;
        }
        double average = (double) sum / numbers.size();
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(average);
    }
}
