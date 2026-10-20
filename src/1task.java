import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BasicStringTasks {
    public static void runTask(int taskNumber) {
        switch (taskNumber) {
            case 1:
                task01();
                break;
            case 2:
                task02();
                break;
            case 3:
                task03();
                break;
            case 4:
                task04();
                break;
            case 5:
                task05();
                break;
            case 6:
                task06();
                break;
            case 7:
                task07();
                break;
            case 8:
                task08();
                break;
            case 9:
                task09();
                break;
            case 10:
                task10();
                break;
            default:
                System.out.println("Задача 1-10 не поддерживается.");
        }
    }

    private static void task01() {
        String s = "Java";
        System.out.println("Строка: '" + s + "'");
        if (s.isEmpty()) {
            System.out.println("Пустая строка.");
            return;
        }
        System.out.println("Длина: " + s.length());
        System.out.println("Первый символ: " + s.charAt(0));
        System.out.println("Последний символ: " + s.charAt(s.length() - 1));
    }

    private static void task02() {
        String s = "Java Example";
        System.out.println("Верхний: " + s.toUpperCase(Locale.ROOT));
        System.out.println("Нижний: " + s.toLowerCase(Locale.ROOT));
    }

    private static void task03() {
        String s = "  Java  ";
        System.out.println("trim(): '" + s.trim() + "'");
    }

    private static void task04() {
        String s = "HelloWorld";
        System.out.println("startsWith(\"Hel\"): " + s.startsWith("Hel"));
        System.out.println("endsWith(\"ld\"): " + s.endsWith("ld"));
    }

    private static void task05() {
        String s = "banana";
        System.out.println(s.replace('a', 'o'));
    }

    private static void task06() {
        String s = "banana";
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Символ '" + ch + "' встречается " + count + " раз");
    }

    private static void task07() {
        String text = "abcabcabc";
        String sub = "bc";
        System.out.println("Первое: " + text.indexOf(sub));
        System.out.println("Последнее: " + text.lastIndexOf(sub));
    }

    private static void task08() {
        String text = "Hello Java";
        String word = "java";
        System.out.println(text.toLowerCase(Locale.ROOT).contains(word.toLowerCase(Locale.ROOT)));
    }

    private static void task09() {
        String a = "Java";
        String b = "JAVA";
        System.out.println(a.equalsIgnoreCase(b));
    }

    private static void task10() {
        String s = "  Java   is   great  ";
        StringBuilder sb = new StringBuilder();
        boolean previousSpace = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (!previousSpace && sb.length() > 0) {
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

    public static String collapseSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        boolean previousSpace = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (!previousSpace && sb.length() > 0) {
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

    public static List<Integer> indexesOfChar(String text, char target) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
