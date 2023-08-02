import java.util.Scanner;

 class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int numTerms = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < numTerms; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
