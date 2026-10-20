import java.util.*;

public class TextHelperApp {
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.println("\n=== Текстовый помощник ===");
            System.out.println("1. Длина строки, первый и последний символ");
            System.out.println("2. Верхний и нижний регистр");
            System.out.println("3. Удаление пробелов по краям");
            System.out.println("4. Проверка префикса и суффикса");
            System.out.println("5. Замена символа");
            System.out.println("6. Подсчёт символа");
            System.out.println("7. Индексы подстроки");
            System.out.println("8. Содержит слово без регистра");
            System.out.println("9. Сравнение строк без регистра");
            System.out.println("10. Убирает лишние пробелы");
            System.out.println("11. Разворот строки");
            System.out.println("12. Проверка палиндрома");
            System.out.println("13. Первые N символов");
            System.out.println("14. Подстрока по индексам");
            System.out.println("15. Удалить пробелы");
            System.out.println("16. Удалить цифры");
            System.out.println("17. Только буквы и пробелы");
            System.out.println("18. Сжать повторяющиеся пробелы");
            System.out.println("19. Все индексы символа");
            System.out.println("20. Разделить строку пополам");
            System.out.println("21. Подсчёт слов");
            System.out.println("22. Самое длинное слово");
            System.out.println("23. Самое короткое слово");
            System.out.println("24. Капитализация слов");
            System.out.println("25. Слова на заданную букву");
            System.out.println("26. Количество предложений");
            System.out.println("27. Слова в обратном порядке");
            System.out.println("28. Самое частое слово");
            System.out.println("29. Уникальные слова");
            System.out.println("30. Обрезать строку с многоточием");
            System.out.println("31. Анаграммы");
            System.out.println("32. Общий префикс");
            System.out.println("33. Общая подстрока");
            System.out.println("34. Неперекрывающиеся вхождения");
            System.out.println("35. Первое вхождение");
            System.out.println("36. Удалить все вхождения");
            System.out.println("37. Сравнение версий");
            System.out.println("38. Сортировка имён");
            System.out.println("39. Слова с подстрокой");
            System.out.println("40. Удалить ровно один символ");
            System.out.println("41. Проверка email");
            System.out.println("42. Проверка телефона");
            System.out.println("43. Проверка пароля");
            System.out.println("44. Формат Фамилия, И.");
            System.out.println("45. Разделитель тысяч");
            System.out.println("46. Только цифры");
            System.out.println("47. Дата dd-MM-yyyy");
            System.out.println("48. Нормализация имени пользователя");
            System.out.println("49. Java identifier");
            System.out.println("50. Домен из URL");
            System.out.println("51. Анализ текста");
            System.out.println("52. Шифр Цезаря, зашифровать");
            System.out.println("53. Шифр Цезаря, расшифровать");
            System.out.println("54. Запрещённые слова");
            System.out.println("55. Сравнение двух текстов");
            System.out.println("56. Баланс скобок");
            System.out.println("57. Нормализация ФИО");
            System.out.println("58. Все индексы фразы");
            System.out.println("59. Первые 20 слов");
            System.out.println("60. Текстовый помощник");
            System.out.println("0. Выход");

            System.out.print("Выберите задачу: ");
            String input = SCAN.nextLine().trim();
            if (input.isEmpty()) {
                continue;
            }

            try {
                int choice = Integer.parseInt(input);
                if (choice == 0) {
                    System.out.println("До свидания!");
                    return;
                }
                runTask(choice);
            } catch (NumberFormatException ex) {
                System.out.println("Введите число от 0 до 60.");
            }
        }
    }

    private static void runTask(int taskNumber) {
        switch (taskNumber) {
            case 1 -> task01();
            case 2 -> task02();
            case 3 -> task03();
            case 4 -> task04();
            case 5 -> task05();
            case 6 -> task06();
            case 7 -> task07();
            case 8 -> task08();
            case 9 -> task09();
            case 10 -> task10();
            case 11 -> task11();
            case 12 -> task12();
            case 13 -> task13();
            case 14 -> task14();
            case 15 -> task15();
            case 16 -> task16();
            case 17 -> task17();
            case 18 -> task18();
            case 19 -> task19();
            case 20 -> task20();
            case 21 -> task21();
            case 22 -> task22();
            case 23 -> task23();
            case 24 -> task24();
            case 25 -> task25();
            case 26 -> task26();
            case 27 -> task27();
            case 28 -> task28();
            case 29 -> task29();
            case 30 -> task30();
            case 31 -> task31();
            case 32 -> task32();
            case 33 -> task33();
            case 34 -> task34();
            case 35 -> task35();
            case 36 -> task36();
            case 37 -> task37();
            case 38 -> task38();
            case 39 -> task39();
            case 40 -> task40();
            case 41 -> task41();
            case 42 -> task42();
            case 43 -> task43();
            case 44 -> task44();
            case 45 -> task45();
            case 46 -> task46();
            case 47 -> task47();
            case 48 -> task48();
            case 49 -> task49();
            case 50 -> task50();
            case 51 -> task51();
            case 52 -> task52();
            case 53 -> task53();
            case 54 -> task54();
            case 55 -> task55();
            case 56 -> task56();
            case 57 -> task57();
            case 58 -> task58();
            case 59 -> task59();
            case 60 -> task60();
            default -> System.out.println("Задача не поддерживается.");
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
        System.out.println(s.startsWith("Hel"));
        System.out.println(s.endsWith("ld"));
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
            if (s.charAt(i) == ch) count++;
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
        boolean prevSpace = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (!prevSpace && sb.length() > 0) {
                    sb.append(' ');
                    prevSpace = true;
                }
            } else {
                sb.append(ch);
                prevSpace = false;
            }
        }
        String result = sb.toString().trim();
        System.out.println(result);
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
        boolean prevSpace = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (!prevSpace) {
                    sb.append(' ');
                    prevSpace = true;
                }
            } else {
                sb.append(ch);
                prevSpace = false;
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
        if (s.length() % 2 == 0) {
            System.out.println("Первая: " + s.substring(0, mid));
            System.out.println("Вторая: " + s.substring(mid));
        } else {
            System.out.println("Первая: " + s.substring(0, mid));
            System.out.println("Вторая: " + s.substring(mid));
        }
    }

    private static void task21() {
        String s = "  Java   is   great  ";
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isWhitespace(ch)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println("Количество слов: " + count);
    }

    private static void task22() {
        String s = "Java is the best";
        String[] words = splitWords(s);
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }

    private static void task23() {
        String s = "Java is the best";
        String[] words = splitWords(s);
        String shortest = null;
        for (String word : words) {
            if (word.isEmpty()) continue;
            if (shortest == null || word.length() < shortest.length()) {
                shortest = word;
            }
        }
        System.out.println(shortest);
    }

    private static void task24() {
        String s = "java is great";
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (sb.length() > 0) sb.append(' ');
            if (word.isEmpty()) continue;
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase(Locale.ROOT));
        }
        System.out.println(sb);
    }

    private static void task25() {
        String s = "Java is great and java";
        char letter = 'j';
        int count = 0;
        for (String word : splitWords(s)) {
            if (word.toLowerCase(Locale.ROOT).startsWith(String.valueOf(letter))) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void task26() {
        String s = "Hello! How are you? Fine.";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') count++;
        }
        System.out.println(count);
    }

    private static void task27() {
        String s = "Java is great";
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(words[i]);
        }
        System.out.println(sb);
    }

    private static void task28() {
        String s = "one two one three two one";
        Map<String, Integer> counts = new HashMap<>();
        LinkedHashMap<String, Integer> order = new LinkedHashMap<>();
        for (String word : splitWords(s)) {
            String key = word.toLowerCase(Locale.ROOT);
            counts.put(key, counts.getOrDefault(key, 0) + 1);
            order.putIfAbsent(key, counts.get(key));
        }
        String best = null;
        int bestCount = -1;
        for (String key : counts.keySet()) {
            int c = counts.get(key);
            if (c > bestCount) {
                best = key;
                bestCount = c;
            }
        }
        System.out.println(best);
    }

    private static void task29() {
        String s = "Java Java is is great";
        Set<String> set = new HashSet<>();
        for (String word : splitWords(s)) {
            if (!set.add(word.toLowerCase(Locale.ROOT))) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    private static void task30() {
        String s = "Очень длинный текст";
        int n = 8;
        if (s.length() <= n) {
            System.out.println(s);
            return;
        }
        String cut = s.substring(0, n - 3) + "...";
        System.out.println(cut);
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
        String[] sorted = sortNamesIgnoreCase(names);
        System.out.println(Arrays.toString(sorted));
    }

    private static void task39() {
        String text = "java script javascript java";
        String sub = "java";
        Set<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String word : splitWords(text)) {
            if (word.toLowerCase(Locale.ROOT).contains(sub.toLowerCase(Locale.ROOT))) {
                result.add(word);
            }
        }
        System.out.println(result);
    }

    private static void task40() {
        String a = "abc";
        String b = "ac";
        System.out.println(canObtainByDeletingOneChar(a, b));
    }

    private static void task41() {
        String email = "user@example.com";
        System.out.println(isSimpleEmail(email));
    }

    private static void task42() {
        String phone = "+7 999-123-45-67";
        System.out.println(isPhoneNumber(phone));
    }

    private static void task43() {
        String password = "Abcdef1";
        System.out.println(isStrongPassword(password));
    }

    private static void task44() {
        String fullName = "Иванов Иван";
        System.out.println(formatName(fullName));
    }

    private static void task45() {
        System.out.println(addThousandsSeparator("1234567"));
    }

    private static void task46() {
        String s = "12345";
        System.out.println(isDigitsOnly(s));
    }

    private static void task47() {
        String s = "31-12-2024";
        System.out.println(convertDateToIso(s));
    }

    private static void task48() {
        String user = "  alex   smith  ";
        System.out.println(normalizeUserName(user));
    }

    private static void task49() {
        String id = "_value1";
        System.out.println(isJavaIdentifier(id));
    }

    private static void task50() {
        String url = "https://www.example.com/path";
        System.out.println(extractDomain(url));
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
        System.out.println("Пример доступных операций: подсчёт слов, разворот, поиск, замена, проверка палиндрома.");
        System.out.println("Подсчёт слов: " + countWords("Java is great"));
        System.out.println("Разворот: " + reverseString("Java"));
        System.out.println("Поиск: " + "Java".contains("av"));
        System.out.println("Замена: " + "banana".replace('a', 'o'));
        System.out.println("Палиндром: " + isPalindrome("level"));
    }

    private static String[] splitWords(String text) {
        if (text == null || text.trim().isEmpty()) return new String[0];
        String[] words = text.trim().split("\\s+");
        return words;
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

    private static int countWords(String text) {
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

    private static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    private static boolean isPalindrome(String text) {
        String filtered = removeNonLettersAndSpaces(text).toLowerCase(Locale.ROOT);
        int left = 0, right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    private static int countNonOverlapping(String text, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    private static String replaceOnlyFirst(String text, String oldValue, String newValue) {
        int index = text.indexOf(oldValue);
        if (index == -1) return text;
        return text.substring(0, index) + newValue + text.substring(index + oldValue.length());
    }

    private static String removeAllOccurrences(String text, String sub) {
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

    private static int compareVersions(String v1, String v2) {
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

    private static String[] sortNamesIgnoreCase(String[] names) {
        List<String> list = new ArrayList<>(Arrays.asList(names));
        list.sort(String.CASE_INSENSITIVE_ORDER);
        return list.toArray(new String[0]);
    }

    private static boolean canObtainByDeletingOneChar(String a, String b) {
        if (Math.abs(a.length() - b.length()) != 1) return false;
        int i = 0, j = 0;
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

    private static boolean isSimpleEmail(String email) {
        if (email == null || email.isEmpty()) return false;
        int at = email.indexOf('@');
        if (at <= 0 || at != email.lastIndexOf('@')) return false;
        String left = email.substring(0, at);
        String right = email.substring(at + 1);
        if (left.isEmpty() || right.isEmpty() || !right.contains(".")) return false;
        return right.indexOf('.') > 0 && right.lastIndexOf('.') < right.length() - 1;
    }

    private static boolean isPhoneNumber(String phone) {
        if (phone == null) return false;
        String cleaned = phone.replace(" ", "").replace("-", "");
        if (!cleaned.startsWith("+7") && !cleaned.startsWith("7") && !cleaned.startsWith("8")) return false;
        if (cleaned.startsWith("+7") || cleaned.startsWith("7") || cleaned.startsWith("8")) {
            String digits = cleaned.replace("+", "");
            return digits.matches("[0-9]{10}") || digits.matches("[0-9]{11}");
        }
        return false;
    }

    private static boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) return false;
        boolean hasUpper = false, hasLower = false, hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
        }
        return hasUpper && hasLower && hasDigit;
    }

    private static String formatName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        if (parts.length < 2) return fullName;
        String lastName = parts[0];
        String firstName = parts[1];
        return lastName + ", " + firstName.charAt(0) + ".";
    }

    private static String addThousandsSeparator(String number) {
        StringBuilder sb = new StringBuilder();
        int len = number.length();
        int counter = 0;
        for (int i = len - 1; i >= 0; i--) {
            sb.append(number.charAt(i));
            counter++;
            if (counter % 3 == 0 && i != 0) {
                sb.append(' ');
            }
        }
        return sb.reverse().toString();
    }

    private static boolean isDigitsOnly(String s) {
        if (s == null || s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    private static String convertDateToIso(String date) {
        String[] parts = date.split("-");
        if (parts.length != 3) return "Некорректный формат";
        if (!isDigitsOnly(parts[0]) || !isDigitsOnly(parts[1]) || !isDigitsOnly(parts[2])) {
            return "Неверные части даты";
        }
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 0) {
            return "Дата вне допустимого диапазона";
        }
        return String.format("%04d/%02d/%02d", year, month, day);
    }

    private static String normalizeUserName(String user) {
        return user == null ? "" : user.trim().replaceAll("\\s+", " ");
    }

    private static boolean isJavaIdentifier(String s) {
        if (s == null || s.isEmpty()) return false;
        if (!(Character.isLetter(s.charAt(0)) || s.charAt(0) == '_' || s.charAt(0) == '$')) return false;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == '_' || ch == '$')) return false;
        }
        return true;
    }

    private static String extractDomain(String url) {
        String withoutProtocol = url.replaceFirst("https?://", "");
        if (withoutProtocol.startsWith("www.")) {
            withoutProtocol = withoutProtocol.substring(4);
        }
        int slash = withoutProtocol.indexOf('/');
        if (slash != -1) {
            withoutProtocol = withoutProtocol.substring(0, slash);
        }
        return withoutProtocol;
    }

    private static void countTextStats(String text) {
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

    private static String caesarEncrypt(String text, int shift) {
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

    private static String caesarDecrypt(String text, int shift) {
        return caesarEncrypt(text, 26 - (shift % 26));
    }

    private static String censorWords(String text, String[] banned) {
        String[] words = text.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String normalized = word.toLowerCase(Locale.ROOT);
            boolean forbidden = false;
            for (String bannedWord : banned) {
                if (normalized.equalsIgnoreCase(bannedWord)) {
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

    private static String compareTexts(String a, String b) {
        Set<String> left = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Set<String> right = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Collections.addAll(left, splitWords(a));
        Collections.addAll(right, splitWords(b));
        StringBuilder sb = new StringBuilder();
        for (String word : left) {
            if (!right.contains(word)) {
                sb.append(word).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private static boolean isBalancedParentheses(String text) {
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

    private static String normalizeFio(String fio) {
        String[] parts = fio.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(parts[i]);
        }
        return sb.toString();
    }

    private static List<Integer> allIndicesOfPhrase(String text, String phrase) {
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

    private static String firstTwentyWords(String text) {
        String[] words = splitWords(text);
        if (words.length <= 20) return String.join(" ", words);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            if (i > 0) sb.append(' ');
            sb.append(words[i]);
        }
        sb.append("...");
        return sb.toString();
    }

    private static boolean isAnagram(String a, String b) {
        String x = a.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        String y = b.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        if (x.length() != y.length()) return false;
        char[] arr1 = x.toCharArray();
        char[] arr2 = y.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    private static String commonPrefix(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int end = 0;
        while (end < min && a.charAt(end) == b.charAt(end)) end++;
        return a.substring(0, end);
    }

    private static String longestCommonSubstring(String a, String b) {
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

    public static String normalizeSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (Character.isWhitespace(text.charAt(i))) {
                if (sb.length() == 0 || sb.charAt(sb.length() - 1) == ' ') {
                    i++;
                    continue;
                }
                sb.append(' ');
            } else {
                sb.append(text.charAt(i));
            }
            i++;
        }
        return sb.toString().trim();
    }

    public static String toUpperCase(String text) {
        return text.toUpperCase(Locale.ROOT);
    }

    public static String toLowerCase(String text) {
        return text.toLowerCase(Locale.ROOT);
    }
}
