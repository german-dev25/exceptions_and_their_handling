import exceptions.*;
/**
 * Класс App является точкой входа в программу.
 */
public class App {
    public static void main(String[] args) {
        // Создаем два банковских счета с начальным балансом
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(500);

        try {
            double amountToTransfer = -300;
            // Переводим средства со счета 1 на счет 2
            account1.transfer(amountToTransfer, account2);
            System.out.println("Перевод выполнен успешно!");
            System.out.println("Баланс на счете 1: " + account1.getBalance());
            System.out.println("Баланс на счете 2: " + account2.getBalance());
        } catch (InvalidAmountException | InsufficientFundsException e) {
            // Обрабатываем возможные исключения
            System.out.println("Ошибка перевода: " + e.getMessage());
        }
    }
}