import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int last = number % 10;
        System.out.println("Last digit of given number is " + last);
    }
}
