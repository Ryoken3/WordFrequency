import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String s: args) {
            if (wordFrequency.containsKey(s)) {
                wordFrequency.put(s, wordFrequency.get(s) + 1);
            } else {
                wordFrequency.put(s, 1);
            }
        }

        List<Map.Entry<String, Integer>> sort = new ArrayList<>(wordFrequency.entrySet());
        sort.sort(Map.Entry.comparingByValue(((o1, o2) -> o2 - o1)));
        for (Map.Entry<String, Integer> pair: sort) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}