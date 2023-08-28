package JavaProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AutocorrectPrototype {
    public static List<List<String>> getSearchResults(List<String> words, List<String> queries) {
        // Create a map to store sorted anagrams as keys and their original words as values
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Process each word and store its sorted form in the map
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }

        // Search for anagrams of each query word in the map and collect the results
        List<List<String>> searchResults = new ArrayList<>();
        for (String query : queries) {
            char[] queryArray = query.toCharArray();
            Arrays.sort(queryArray);
            String sortedQuery = new String(queryArray);
            searchResults.add(anagramMap.getOrDefault(sortedQuery, new ArrayList<>()));
        }

        return searchResults;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }
        int querySize = scanner.nextInt();
        scanner.nextLine();
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < querySize; i++) {
            String query = scanner.nextLine();
            queries.add(query);
        }

        scanner.close();

        List<List<String>> results = getSearchResults(words, queries);
        for (List<String> result : results) {
            System.out.println(result);
        }
    }
}
