import calculators.*;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        PowerCalculator powerCalculator = new PowerCalculator();

        try {
            System.out.println(calculator.divide(10, 0));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода чисел: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Вышла ошибка: " + e.getMessage());
        }

        try {
            System.out.println(calculator.addition(1.0e+308, 1.0e+308));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода чисел: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Вышла ошибка: " + e.getMessage());
        }

        try {
            System.out.println(calculator.multiply(1.7976931348623157e+308, 2.0));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода чисел: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Вышла ошибка: " + e.getMessage());
        }

        try {
            System.out.println(calculator.subtract(10, 10));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода чисел: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Вышла ошибка: " + e.getMessage());
        }

        try {
            System.out.println(powerCalculator.calculatePower(0, -2));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода чисел: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Вышла ошибка: " + e.getMessage());
        }
    }
}
