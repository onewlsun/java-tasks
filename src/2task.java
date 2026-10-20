import java.util.Locale;

public class FormatValidationTasks {
    public static void runTask(int taskNumber) {
        switch (taskNumber) {
            case 41:
                task41();
                break;
            case 42:
                task42();
                break;
            case 43:
                task43();
                break;
            case 44:
                task44();
                break;
            case 45:
                task45();
                break;
            case 46:
                task46();
                break;
            case 47:
                task47();
                break;
            case 48:
                task48();
                break;
            case 49:
                task49();
                break;
            case 50:
                task50();
                break;
            default:
                System.out.println("Задача 41-50 не поддерживается.");
        }
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

    public static boolean isSimpleEmail(String email) {
        if (email == null || email.isEmpty()) return false;
        int at = email.indexOf('@');
        if (at <= 0 || at != email.lastIndexOf('@')) return false;
        String left = email.substring(0, at);
        String right = email.substring(at + 1);
        if (left.isEmpty() || right.isEmpty() || !right.contains(".")) return false;
        return right.indexOf('.') > 0 && right.lastIndexOf('.') < right.length() - 1;
    }

    public static boolean isPhoneNumber(String phone) {
        if (phone == null) return false;
        String cleaned = phone.replace(" ", "").replace("-", "");
        if (!cleaned.startsWith("+7") && !cleaned.startsWith("7") && !cleaned.startsWith("8")) return false;
        String digits = cleaned.replace("+", "");
        return digits.matches("[0-9]{10}") || digits.matches("[0-9]{11}");
    }

    public static boolean isStrongPassword(String password) {
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

    public static String formatName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        if (parts.length < 2) return fullName;
        return parts[0] + ", " + parts[1].charAt(0) + ".";
    }

    public static String addThousandsSeparator(String number) {
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

    public static boolean isDigitsOnly(String s) {
        if (s == null || s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    public static String convertDateToIso(String date) {
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

    public static String normalizeUserName(String user) {
        return user == null ? "" : user.trim().replaceAll("\\s+", " ");
    }

    public static boolean isJavaIdentifier(String s) {
        if (s == null || s.isEmpty()) return false;
        if (!(Character.isLetter(s.charAt(0)) || s.charAt(0) == '_' || s.charAt(0) == '$')) return false;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == '_' || ch == '$')) return false;
        }
        return true;
    }

    public static String extractDomain(String url) {
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
}
