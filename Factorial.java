import java.util.Scanner;

public class Factorial{
 
    // factorial method declaration
    public static int factorial(int n) {
        if(n < 0){
            System.out.println("Error: n must be positive");
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    // main method
    public static void main(String[] args) {
        // variable declaration and initialization
        int n=10;

        // object declaration and initialization
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));

        sc.close();
    }
}