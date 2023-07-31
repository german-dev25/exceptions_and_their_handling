package exceptions;

/**
 * Класс InvalidAmountException представляет собой пользовательское исключение,
 * которое выбрасывается при попытке выполнить перевод с некорректной суммой.
 */
public class InvalidAmountException extends RuntimeException {
    /**
     * Конструктор класса InvalidAmountException.
     *
     * @param message сообщение об ошибке
     */
    public InvalidAmountException(String message) {
        super(message);
    }
}