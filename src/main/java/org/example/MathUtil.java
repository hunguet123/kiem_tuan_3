package org.example;

public class MathUtil {
    public double calculateInterest(double principal, double rate, int numberOfYears, int compoundingFrequency) {
        if (principal <= 0 || rate <= 0 || numberOfYears <=0 || compoundingFrequency <=0)
            return 0;
        // Tính lãi xuất với công thức lãi kép (compound interest formula)
        double compoundRate = 1 + (rate / compoundingFrequency);
        double numberOfCompounds = compoundingFrequency * numberOfYears;
        double amount = principal * Math.pow(compoundRate, numberOfCompounds);

        // Trả về số tiền tích luỹ
        return amount;
    }
}
