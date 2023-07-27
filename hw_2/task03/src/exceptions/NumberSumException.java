package exceptions;

public class NumberSumException extends Exception {
    public NumberSumException(String message) {
        super(message);
    }

    public static void checkSum(int number1, int number2) throws NumberSumException {
        int sum = number1 + number2;
        if (sum < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
    }
}
