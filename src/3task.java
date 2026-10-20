import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class SearchCompareTransformTasks {
    public static void runTask(int taskNumber) {
        switch (taskNumber) {
            case 31:
                task31();
                break;
            case 32:
                task32();
                break;
            case 33:
                task33();
                break;
            case 34:
                task34();
                break;
            case 35:
                task35();
                break;
            case 36:
                task36();
                break;
            case 37:
                task37();
                break;
            case 38:
                task38();
                break;
            case 39:
                task39();
                break;
            case 40:
                task40();
                break;
            default:
                System.out.println("Задача 31-40 не поддерживается.");
        }
    }

    private static void task31() {
        String a = "Astronomer";
        String b = "Moon starer";
        System.out.println(isAnagram(a, b));
    }

    private static void task32() {
        String a = "JavaScript";
        String b = "JavaProgram";
        System.out.println(commonPrefix(a, b));
    }

    private static void task33() {
        String a = "abcdxyz";
        String b = "xyzabcd";
        System.out.println(longestCommonSubstring(a, b));
    }

    private static void task34() {
        String text = "aaaabaaa";
        String sub = "aa";
        System.out.println(countNonOverlapping(text, sub));
    }

    private static void task35() {
        String text = "banana";
        String sub = "na";
        System.out.println(replaceOnlyFirst(text, sub, "X"));
    }

    private static void task36() {
        String text = "javajava";
        String sub = "java";
        System.out.println(removeAllOccurrences(text, sub));
    }

    private static void task37() {
        System.out.println(compareVersions("2.10", "2.9"));
    }

    private static void task38() {
        String[] names = {"alice", "Bob", "charlie", "Ann"};
        System.out.println(Arrays.toString(sortNamesIgnoreCase(names)));
    }

    private static void task39() {
        String text = "java script javascript java";
        String sub = "java";
        System.out.println(findWordsContainingSubstring(text, sub));
    }

    private static void task40() {
        String a = "abc";
        String b = "ac";
        System.out.println(canObtainByDeletingOneChar(a, b));
    }

    public static boolean isAnagram(String a, String b) {
        String x = a.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        String y = b.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        if (x.length() != y.length()) {
            return false;
        }
        char[] arr1 = x.toCharArray();
        char[] arr2 = y.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static String commonPrefix(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int end = 0;
        while (end < min && a.charAt(end) == b.charAt(end)) {
            end++;
        }
        return a.substring(0, end);
    }

    public static String longestCommonSubstring(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        int bestLen = 0;
        int bestEnd = 0;
        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > bestLen) {
                        bestLen = dp[i][j];
                        bestEnd = i;
                    }
                }
            }
        }
        return a.substring(bestEnd - bestLen, bestEnd);
    }

    public static int countNonOverlapping(String text, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static String replaceOnlyFirst(String text, String oldValue, String newValue) {
        int index = text.indexOf(oldValue);
        if (index == -1) return text;
        return text.substring(0, index) + newValue + text.substring(index + oldValue.length());
    }

    public static String removeAllOccurrences(String text, String sub) {
        if (sub.isEmpty()) return text;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < text.length()) {
            int found = text.indexOf(sub, index);
            if (found == -1) {
                sb.append(text.substring(index));
                break;
            }
            sb.append(text.substring(index, found));
            index = found + sub.length();
        }
        return sb.toString();
    }

    public static int compareVersions(String v1, String v2) {
        String[] a = v1.split("\\.");
        String[] b = v2.split("\\.");
        int maxLen = Math.max(a.length, b.length);
        for (int i = 0; i < maxLen; i++) {
            int x = i < a.length ? Integer.parseInt(a[i]) : 0;
            int y = i < b.length ? Integer.parseInt(b[i]) : 0;
            if (x < y) return -1;
            if (x > y) return 1;
        }
        return 0;
    }

    public static String[] sortNamesIgnoreCase(String[] names) {
        List<String> list = new ArrayList<>(Arrays.asList(names));
        list.sort(String.CASE_INSENSITIVE_ORDER);
        return list.toArray(new String[0]);
    }

    public static Set<String> findWordsContainingSubstring(String text, String sub) {
        Set<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String word : text.split("\\s+")) {
            if (word.toLowerCase(Locale.ROOT).contains(sub.toLowerCase(Locale.ROOT))) {
                result.add(word);
            }
        }
        return result;
    }

    public static boolean canObtainByDeletingOneChar(String a, String b) {
        if (Math.abs(a.length() - b.length()) != 1) {
            return false;
        }
        int i = 0;
        int j = 0;
        boolean deleted = false;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else {
                if (deleted) return false;
                deleted = true;
                i++;
            }
        }
        return true;
    }
}
