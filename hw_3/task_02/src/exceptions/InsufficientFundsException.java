package exceptions;

/**
 * Класс InsufficientFundsException представляет собой пользовательское исключение,
 * которое выбрасывается при попытке выполнить перевод с недостаточным балансом на счете.
 */
public class InsufficientFundsException extends RuntimeException {
    /**
     * Конструктор класса InsufficientFundsException.
     *
     * @param message сообщение об ошибке
     */
    public InsufficientFundsException(String message) {
        super(message);
    }
}