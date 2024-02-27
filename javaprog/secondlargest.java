import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        String n = Integer.toString(number);
        System.out.println("Second Last digit of given number is " + n.charAt(n.length() - 2));
    }
}
