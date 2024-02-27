import java.util.Scanner;

public class printodd {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] num = new int[size];
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                count++;
            }

        }
        System.out.println("Odd Count : " + count);
        s.close();

    }
}