import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        for (int i = 0; i <= 100; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
        s.close();
    }
}
