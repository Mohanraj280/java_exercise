import java.util.Scanner;

public class anymultiply {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int range = s.nextInt();
        for (int i = 0; i <= range; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
        s.close();
    }
}
