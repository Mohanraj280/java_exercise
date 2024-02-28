import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <= 255; i++) {
            System.out.println((char) i + " " + i);
        }
    }
}
