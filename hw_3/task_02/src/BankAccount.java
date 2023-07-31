import exceptions.*;

/**
 * Класс BankAccount представляет банковский счет, на котором можно осуществлять переводы средств.
 */
public class BankAccount {
    private double balance; // Баланс счета

    /**
     * Конструктор класса BankAccount.
     * @param initialBalance начальный баланс счета
     */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance; // Устанавливаем начальный баланс
    }

    /**
     * Метод для получения текущего баланса счета.
     * @return текущий баланс счета
     */
    public double getBalance() {
        return balance; // Возвращаем текущий баланс
    }

    /**
     * Метод для выполнения перевода средств на другой счет.
     * @param amount сумма перевода
     * @param targetAccount целевой банковский счет
     * @throws InvalidAmountException если сумма перевода некорректна (отрицательная или равна нулю)
     * @throws InsufficientFundsException если недостаточно средств на текущем счете для перевода
     */
    public void transfer(double amount, BankAccount targetAccount) {
        if (amount <= 0) {
            // Если сумма перевода некорректна, выбрасываем исключение
            throw new InvalidAmountException("Некорректная сумма перевода"); 
        }

        if (balance < amount) {
            // Если недостаточно средств для перевода, выбрасываем исключение
            throw new InsufficientFundsException("Недостаточно средств на счете"); 
        }

        // Уменьшаем баланс текущего счета на сумму перевода
        balance -= amount; 
        // Увеличиваем баланс целевого счета на сумму перевода
        targetAccount.balance += amount; 
    }
}
