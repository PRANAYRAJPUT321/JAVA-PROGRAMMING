import java.util.Scanner;

class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks of first subject: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the marks of second subject: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the marks of third subject: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the marks of fourth subject: ");
        int num4 = scanner.nextInt();

        System.out.print("Enter the marks of fifth subject: ");
        int num5 = scanner.nextInt();

        float sum = num1 + num2 +num3 +num4 +num5 ;
        float avg =sum/5;
        float percentage =(sum*100)/500;
        System.out.println("Total no of the marks is: " + sum);
        System.out.println("Average of total marks is: " + avg);
        System.out.println("Percentage of the student is: " + percentage);

        scanner.close();
    }
}
