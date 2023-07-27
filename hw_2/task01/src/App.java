import java.util.Scanner;
import exceptions.InvalidNumberException;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число > 0: ");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                // Проверяем, что число положительное
                InvalidNumberException.checkPositiveNumber(number);
                System.out.println("Число корректно.");
            } catch (NumberFormatException ex) {
                // Если введено некорректное число
                System.out.println("Ошибка: Введите корректное число.");
            } catch (InvalidNumberException ex) {
                // Если число меньше или равно нулю
                System.out.println("Ошибка: " + ex.getMessage());
            }
        }
    }
}
