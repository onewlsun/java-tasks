import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TextAnalysisTasks {
    public static void runTask(int taskNumber) {
        switch (taskNumber) {
            case 51:
                task51();
                break;
            case 52:
                task52();
                break;
            case 53:
                task53();
                break;
            case 54:
                task54();
                break;
            case 55:
                task55();
                break;
            case 56:
                task56();
                break;
            case 57:
                task57();
                break;
            case 58:
                task58();
                break;
            case 59:
                task59();
                break;
            case 60:
                task60();
                break;
            default:
                System.out.println("Задача 51-60 не поддерживается.");
        }
    }

    private static void task51() {
        String text = "Hello, 123 world!";
        countTextStats(text);
    }

    private static void task52() {
        String text = "Hello";
        System.out.println(caesarEncrypt(text, 3));
    }

    private static void task53() {
        String text = "Khoor";
        System.out.println(caesarDecrypt(text, 3));
    }

    private static void task54() {
        String text = "bad word and BAD";
        String[] banned = {"bad", "word"};
        System.out.println(censorWords(text, banned));
    }

    private static void task55() {
        String a = "one two three";
        String b = "three two four";
        System.out.println(compareTexts(a, b));
    }

    private static void task56() {
        String s = "(())()";
        System.out.println(isBalancedParentheses(s));
    }

    private static void task57() {
        String fio = "  иванов   иван   иванович  ";
        System.out.println(normalizeFio(fio));
    }

    private static void task58() {
        String text = "Java Java java";
        String phrase = "java";
        System.out.println(allIndicesOfPhrase(text, phrase));
    }

    private static void task59() {
        String text = "one two three four five six seven eight nine ten eleven twelve";
        System.out.println(firstTwentyWords(text));
    }

    private static void task60() {
        System.out.println("Запущен текстовый помощник.");
        System.out.println("Подсчёт слов: " + countWords("Java is great"));
        System.out.println("Разворот: " + reverseString("Java"));
        System.out.println("Палиндром: " + isPalindrome("level"));
    }

    public static void countTextStats(String text) {
        int letters = 0, digits = 0, spaces = 0, punctuation = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace(ch)) spaces++;
            else punctuation++;
        }
        System.out.println("Символы: " + text.length());
        System.out.println("Буквы: " + letters);
        System.out.println("Цифры: " + digits);
        System.out.println("Пробелы: " + spaces);
        System.out.println("Знаки пунктуации: " + punctuation);
    }

    public static String caesarEncrypt(String text, int shift) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append((char) ('A' + (c - 'A' + shift) % 26));
            } else if (Character.isLowerCase(c)) {
                sb.append((char) ('a' + (c - 'a' + shift) % 26));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String caesarDecrypt(String text, int shift) {
        return caesarEncrypt(text, 26 - (shift % 26));
    }

    public static String censorWords(String text, String[] banned) {
        String[] words = text.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean forbidden = false;
            for (String bannedWord : banned) {
                if (word.equalsIgnoreCase(bannedWord)) {
                    forbidden = true;
                    break;
                }
            }
            if (forbidden) {
                sb.append("*".repeat(word.length()));
            } else {
                sb.append(word);
            }
            if (i < words.length - 1) sb.append(' ');
        }
        return sb.toString();
    }

    public static String compareTexts(String a, String b) {
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        for (String word : a.split("\\s+")) {
            left.add(word.toLowerCase(Locale.ROOT));
        }
        for (String word : b.split("\\s+")) {
            right.add(word.toLowerCase(Locale.ROOT));
        }
        StringBuilder sb = new StringBuilder();
        for (String word : left) {
            if (!right.contains(word)) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(word);
            }
        }
        return sb.toString();
    }

    public static boolean isBalancedParentheses(String text) {
        int balance = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '(') balance++;
            else if (ch == ')') {
                balance--;
                if (balance < 0) return false;
            }
        }
        return balance == 0;
    }

    public static String normalizeFio(String fio) {
        String[] parts = fio.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(part);
        }
        return sb.toString();
    }

    public static List<Integer> allIndicesOfPhrase(String text, String phrase) {
        List<Integer> result = new ArrayList<>();
        String lowerText = text.toLowerCase(Locale.ROOT);
        String lowerPhrase = phrase.toLowerCase(Locale.ROOT);
        int index = 0;
        while (index <= lowerText.length() - lowerPhrase.length()) {
            int found = lowerText.indexOf(lowerPhrase, index);
            if (found == -1) break;
            result.add(found);
            index = found + lowerPhrase.length();
        }
        return result;
    }

    public static String firstTwentyWords(String text) {
        String[] words = text.trim().split("\\s+");
        if (words.length <= 20) return String.join(" ", words);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            if (i > 0) sb.append(' ');
            sb.append(words[i]);
        }
        sb.append("...");
        return sb.toString();
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

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String text) {
        String normalized = text.toLowerCase(Locale.ROOT).replaceAll("\\s+", "");
        return normalized.equals(reverseString(normalized));
    }
}
