import java.util.Scanner;
import exceptions.DivisionByZeroException;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                double number1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Введите второе число: ");
                double number2 = Double.parseDouble(scanner.nextLine());

                // Пробуем получить результат
                double result = DivisionByZeroException.divideNumbers(number1, number2);
                System.out.println("Результат деления: " + result);
            } catch (NumberFormatException ex) {
                // Если введены некорректные числа
                System.out.println("Ошибка: Введите корректные числа.");
            } catch (DivisionByZeroException ex) {
                // Если второе число = 0
                System.out.println(ex.getMessage());
            }
        }
    }
}
