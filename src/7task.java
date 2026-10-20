import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class WordAndSentenceTasks {
    public static void runTask(int taskNumber) {
        switch (taskNumber) {
            case 21:
                task21();
                break;
            case 22:
                task22();
                break;
            case 23:
                task23();
                break;
            case 24:
                task24();
                break;
            case 25:
                task25();
                break;
            case 26:
                task26();
                break;
            case 27:
                task27();
                break;
            case 28:
                task28();
                break;
            case 29:
                task29();
                break;
            case 30:
                task30();
                break;
            default:
                System.out.println("Задача 21-30 не поддерживается.");
        }
    }

    private static void task21() {
        String s = "  Java   is   great  ";
        System.out.println(countWords(s));
    }

    private static void task22() {
        String s = "Java is the best";
        System.out.println(longestWord(s));
    }

    private static void task23() {
        String s = "Java is the best";
        System.out.println(shortestWord(s));
    }

    private static void task24() {
        String s = "java is great";
        System.out.println(capitalizeWords(s));
    }

    private static void task25() {
        String s = "Java is great and java";
        System.out.println(countWordsStartingWith(s, 'j'));
    }

    private static void task26() {
        String s = "Hello! How are you? Fine.";
        System.out.println(countSentences(s));
    }

    private static void task27() {
        String s = "Java is great";
        System.out.println(reverseWords(s));
    }

    private static void task28() {
        String s = "one two one three two one";
        System.out.println(mostFrequentWord(s));
    }

    private static void task29() {
        String s = "Java Java is is great";
        System.out.println(allWordsUnique(s));
    }

    private static void task30() {
        String s = "Очень длинный текст";
        System.out.println(trimToLength(s, 8));
    }

    public static int countWords(String text) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!Character.isWhitespace(ch)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    public static String longestWord(String text) {
        String[] words = splitWords(text);
        if (words.length == 0) {
            return "";
        }
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static String shortestWord(String text) {
        String[] words = splitWords(text);
        if (words.length == 0) {
            return "";
        }
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }

    public static String capitalizeWords(String text) {
        String[] words = splitWords(text);
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1).toLowerCase(Locale.ROOT));
        }
        return sb.toString();
    }

    public static int countWordsStartingWith(String text, char letter) {
        int count = 0;
        char target = Character.toLowerCase(letter);
        for (String word : splitWords(text)) {
            if (Character.toLowerCase(word.charAt(0)) == target) {
                count++;
            }
        }
        return count;
    }

    public static int countSentences(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                count++;
            }
        }
        return count;
    }

    public static String reverseWords(String text) {
        String[] words = splitWords(text);
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }

    public static String mostFrequentWord(String text) {
        Map<String, Integer> counts = new HashMap<>();
        for (String word : splitWords(text)) {
            String key = word.toLowerCase(Locale.ROOT);
            counts.put(key, counts.getOrDefault(key, 0) + 1);
        }
        String result = "";
        int bestCount = -1;
        for (String key : counts.keySet()) {
            int count = counts.get(key);
            if (count > bestCount) {
                result = key;
                bestCount = count;
            }
        }
        return result;
    }

    public static boolean allWordsUnique(String text) {
        Set<String> set = new HashSet<>();
        for (String word : splitWords(text)) {
            if (!set.add(word.toLowerCase(Locale.ROOT))) {
                return false;
            }
        }
        return true;
    }

    public static String trimToLength(String text, int n) {
        if (text.length() <= n) {
            return text;
        }
        if (n <= 3) {
            return text.substring(0, n);
        }
        return text.substring(0, n - 3) + "...";
    }

    private static String[] splitWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[0];
        }
        return text.trim().split("\\s+");
    }
}
