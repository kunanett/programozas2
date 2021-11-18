package examples.week11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Feladat1 {
    public static void main(String[] args) throws IOException {
        Set<String> words = new HashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/examples/week11/input.txt"));
        String line;
        while ((line = reader.readLine()) != null){
            String[] data = line.split(" ");
            //words.addAll(List.of(data));
            for (String word: data){
                words.add(word);
            }
        }
        System.out.println(words.size());
    }
}
