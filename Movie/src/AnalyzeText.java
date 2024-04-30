import java.util.*;

public class AnalyzeText {
    public static int totalSentences;
    public static int totalWords;
    public static int uniqueWordCount;
    public static int uniqueCharacterCount;
    public static Map<String, Integer> wordFrequencies;

    public static void analyzeText(String text) {
        String[] sentences = text.split("\\. ");
        totalSentences = sentences.length;
        List<String> wordsList = new ArrayList<>();
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            Collections.addAll(wordsList, words);
        }
        totalWords = wordsList.size();
        Set<String> uniqueWords = new HashSet<>(wordsList);
        uniqueWordCount = uniqueWords.size();
        Set<Character> uniqueCharacters = new HashSet<>();
        for (String word : wordsList) {
            for (char c : word.toCharArray()) {
                uniqueCharacters.add(c);
            }
        }
        uniqueCharacterCount = uniqueCharacters.size();
        wordFrequencies = new HashMap<>();
        for (String word : wordsList) {
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }
    }
}
