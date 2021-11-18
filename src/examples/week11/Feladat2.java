package examples.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Feladat2 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> words = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/examples/week11/input.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(" ");
            //words.addAll(List.of(data));
            for (String word : data) {
                if (words.containsKey(word)) {
                    words.replace(word, words.get(word) + 1);
                } else {
                    words.put(word, 1);
                }
            }
        }
        for (String word : words.keySet()) {
            System.out.println(word + ": " + words.get(word));
        }
        System.out.println(words.size());
    }
}
