public class PasswordVerifier {
    public boolean verify(String password) throws Exception {
        // Проверка длины пароля
        if (password.length() < 8) {
            throw new Exception("Пароль должен быть не менее 8 символов.");
        }

        // Проверка наличия хотя бы одной цифры
        if (!password.matches(".*\\d.*")) {
            throw new Exception("Пароль должен содержать хотя бы одну цифру.");
        }

        // Проверка наличия хотя бы одной заглавной буквы
        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Пароль должен содержать хотя бы одну заглавную букву.");
        }

        // Если пароль прошел все проверки, вернуть true
        return true;
    }

    public static void main(String[] args) {
        PasswordVerifier verifier = new PasswordVerifier();

        try {
            verifier.verify("Weak"); // Этот пароль не соответствует правилам и выбросит исключение
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            verifier.verify("StrongPass123"); // Этот пароль соответствует правилам
            System.out.println("Пароль корректен.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
