package calculators;
import exceptions.*;

public class PowerCalculator {
    public double calculatePower(double a, double b) {
        if (a == 0 && b > 0) throw new InvalidInputException("Основание не может быть = 0");
        if (a != 0 && b < 0) throw new InvalidInputException("Степень не может быть отрицательной");
        if (a == 0 && b < 0) throw new InvalidInputException("Основание не может быть равно 0 и степень не может быть отрицательной");
        return Math.pow(a, b);
    }   
}

