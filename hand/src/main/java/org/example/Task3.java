package org.example;
import java.util.*;



public class Task3 {
    public static List<String> mostWords(String text, int n) {
        String[] words = text.split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            if (word.equals("")) {
                continue;
            }
            if (counts.containsKey(word)) {
                counts.put(word, counts.get(word) + 1);
            } else {
                counts.put(word, 1);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String bestWord = "";
            int bestCount = -1;
            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                if (!result.contains(entry.getKey()) && entry.getValue() > bestCount) {
                    bestCount = entry.getValue();
                    bestWord = entry.getKey();
                }
            }
            if (!bestWord.equals("")) {
                result.add(bestWord);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String text = "java is great java is powerful" + "python is great too but java is java";
        int n = 3;
        List<String> result = mostWords(text, n);
        System.out.println(result);
    }

}
