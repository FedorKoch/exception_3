public class MiniCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return (double) a / b;
    }

    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        MiniCalculator calculator = new MiniCalculator();

        int a = 10;
        int b = 5;

        System.out.println("Сложение: " + calculator.add(a, b));
        System.out.println("Вычитание: " + calculator.subtract(a, b));
        System.out.println("Умножение: " + calculator.multiply(a, b));

        try {
            System.out.println("Деление: " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.err.println("Ошибка при делении: " + e.getMessage());
        }

        int base = 2;
        int exponent = 3;
        System.out.println("Возведение в степень: " + calculator.power(base, exponent));
    }
}
