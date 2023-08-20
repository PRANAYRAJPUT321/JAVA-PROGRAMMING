import java.util.Scanner;

class Armstrong {
    private int number;
    
    public Armstrong(int number) {
        this.number = number;
    }
    
    public boolean isArmstrong() {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
}


