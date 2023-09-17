import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        Armstrong checker = new Armstrong(num);
        
        if (checker.isArmstrong()) {
            System.out.println(num + " is An Armstrong number.");
        } else {
            System.out.println(num + " is Not An Armstrong number.");
        }
        
        scanner.close();
    }
}
