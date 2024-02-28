import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int n;
        int sum = 0;
        while (number > 0) {
            n = number % 10;
            sum = sum * 10 + n;
            n /= 10;
        }
        System.out.println(sum);
    }
}
