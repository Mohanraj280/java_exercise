import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        for (int i = 1; i <= 100; i++) {

            if (i % number1 == 0 && i % number2 == 0) {
                System.out.println("Number which is divisible by " + number1 + " & " + number2 + " : " + i);
            }

        }
        s.close();
    }
}
