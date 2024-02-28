import java.util.Scanner;

public class firsteven {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        System.out.println("Even Numbers from 1 to " + size + ": ");
        for (int i = 1; i < size; i++) {

            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
        s.close();

    }
}
