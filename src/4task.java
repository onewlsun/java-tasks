import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StringTransformTasks {
    public static void runTask(int taskNumber) {
        switch (taskNumber) {
            case 11:
                task11();
                break;
            case 12:
                task12();
                break;
            case 13:
                task13();
                break;
            case 14:
                task14();
                break;
            case 15:
                task15();
                break;
            case 16:
                task16();
                break;
            case 17:
                task17();
                break;
            case 18:
                task18();
                break;
            case 19:
                task19();
                break;
            case 20:
                task20();
                break;
            default:
                System.out.println("Задача 11-20 не поддерживается.");
        }
    }

    private static void task11() {
        String s = "Java";
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        System.out.println(reversed);
    }

    private static void task12() {
        String s = "A man a plan a canal Panama";
        String cleaned = removeNonLettersAndSpaces(s).toLowerCase(Locale.ROOT);
        StringBuilder reversed = new StringBuilder();
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed.append(cleaned.charAt(i));
        }
        System.out.println(cleaned.equals(reversed.toString()));
    }

    private static void task13() {
        String s = "Hello";
        int n = 3;
        if (n < 0 || n > s.length()) {
            System.out.println("N вне допустимого диапазона");
            return;
        }
        System.out.println(s.substring(0, n));
    }

    private static void task14() {
        String s = "HelloWorld";
        int start = 1, end = 5;
        if (start < 0 || end > s.length() || start > end) {
            System.out.println("Некорректные индексы");
            return;
        }
        System.out.println(s.substring(start, end));
    }

    private static void task15() {
        String s = "J a v a";
        System.out.println(s.replace(" ", ""));
    }

    private static void task16() {
        String s = "A1b2C3";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }

    private static void task17() {
        String s = "A1 b2! C3?";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) || ch == ' ') {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    private static void task18() {
        String s = "Java   is   great";
        StringBuilder sb = new StringBuilder();
        boolean previousSpace = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (!previousSpace) {
                    sb.append(' ');
                    previousSpace = true;
                }
            } else {
                sb.append(ch);
                previousSpace = false;
            }
        }
        System.out.println(sb.toString().trim());
    }

    private static void task19() {
        String s = "banana";
        char ch = 'a';
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indexes.add(i);
            }
        }
        System.out.println(indexes);
    }

    private static void task20() {
        String s = "abcdef";
        int mid = s.length() / 2;
        System.out.println("Первая: " + s.substring(0, mid));
        System.out.println("Вторая: " + s.substring(mid));
    }

    public static String reverse(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String text) {
        String filtered = removeNonLettersAndSpaces(text).toLowerCase(Locale.ROOT);
        return filtered.equals(reverse(filtered));
    }

    public static String firstN(String text, int n) {
        if (n < 0 || n > text.length()) {
            throw new IllegalArgumentException("N вне допустимого диапазона");
        }
        return text.substring(0, n);
    }

    public static String substringRange(String text, int start, int end) {
        if (start < 0 || end > text.length() || start > end) {
            throw new IllegalArgumentException("Некорректные индексы");
        }
        return text.substring(start, end);
    }

    public static String removeSpaces(String text) {
        return text.replace(" ", "");
    }

    public static String removeDigits(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                sb.append(text.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String keepLettersAndSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch) || ch == ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String compressSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        boolean previousSpace = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!previousSpace) {
                    sb.append(' ');
                    previousSpace = true;
                }
            } else {
                sb.append(ch);
                previousSpace = false;
            }
        }
        return sb.toString().trim();
    }

    public static List<Integer> findAllIndexes(String text, char target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                result.add(i);
            }
        }
        return result;
    }

    public static String[] splitInHalf(String text) {
        int mid = text.length() / 2;
        return new String[]{text.substring(0, mid), text.substring(mid)};
    }

    private static String removeNonLettersAndSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch) || Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
