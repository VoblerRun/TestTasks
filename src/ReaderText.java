import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderText {


    public void getNumberOccurrences(String path){
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            lines.flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
                    .map(word -> word.replaceAll("\\P{L}", "").trim())
                    .map(String::toLowerCase)
                    .filter(word -> word.length() > 0)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue)))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
