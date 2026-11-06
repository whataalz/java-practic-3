package org.example;
import java.util.*;


public class Task2 {
    public static void main(String[] args) {
        List<String> input = List.of("listen", "silent", "enlist", "hello", "world", "cat", "act", "tac");
        Map<String, List<String>> map = new LinkedHashMap<>();

        for (String word : input) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);
    }
}
