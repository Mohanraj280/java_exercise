import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        int rem, sum = 0;
        int org = number;
        while (org > 0) {
            rem = org % 10;
            sum += Math.pow(rem, 3);
            org = org / 10;
        }
        if (sum == number) {
            System.out.println(number + " is an ArmStrong Number");
        } else {

            System.out.println(number + " is not an ArmStrong Number");
        }
    }
}
