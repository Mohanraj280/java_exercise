import java.util.Scanner;

public class continueexam {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}
