import java.util.Scanner;
 class Add {  // created class of name Add.
    public static void main(String[] args) { //main function
        Scanner scanner = new Scanner(System.in); // creating object of scanner class

        System.out.print("Enter the first number: "); 
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
       
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
        scanner.close();
    }
}
