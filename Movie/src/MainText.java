
import java.util.*;

public class MainText {
    public static void main(String[] args) {
        String text = "Technology is the use of scientific knowledge for practical purposes or applications, whether in industry or in our everyday lives. So, basically, whenever we use our scientific knowledge to achieve some specific purpose, we're using technology.";
        AnalyzeText.analyzeText(text);

        System.out.println("Total sentences: " + AnalyzeText.totalSentences);
        System.out.println("Total words: " + AnalyzeText.totalWords);
        System.out.println("Unique words: " + AnalyzeText.uniqueWordCount);
        System.out.println("Unique characters: " + AnalyzeText.uniqueCharacterCount);
        System.out.println("Word Frequency: ");
        for (Map.Entry<String, Integer> entry : AnalyzeText.wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
