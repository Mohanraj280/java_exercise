import java.util.Scanner;

public class breakexam {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i = 1; i < num; i++) {

            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("After Break");
    }
}
