import java.util.Scanner;
import exceptions.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                int number1 = Integer.parseInt(scanner.nextLine());
                NumberOutOfRangeException.checkNumber1(number1);

                System.out.print("Введите второе число: ");
                int number2 = Integer.parseInt(scanner.nextLine());
                NumberOutOfRangeException.checkNumber2(number2);

                NumberSumException.checkSum(number1, number2);

                System.out.print("Введите третье число: ");
                int number3 = Integer.parseInt(scanner.nextLine());
                DivisionByZeroException.checkNumber3(number3);

                System.out.println("Проверка пройдена успешно.");
            } catch (NumberFormatException ex) {
                System.out.println("Ошибка: Введите корректные числа.");
            } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
