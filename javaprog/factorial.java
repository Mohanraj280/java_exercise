import java.util.Scanner;

public class factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        int i, fact = 1;
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}