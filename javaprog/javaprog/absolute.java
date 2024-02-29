public class absolute {

    public static int reduceToSingleDigit(int n) {
        while (n >= 10) {
            int temp = 0;
            while (n > 0) {
                temp += n % 10;
                n /= 10;
            }
            n = temp;
        }
        return n;
    }

    public static void main(String[] args) {
        int N1 = 6972;
        int N2 = 123456;

        System.out.println("Output for N1 = " + N1 + ": " + reduceToSingleDigit(N1));
        System.out.println("Output for N2 = " + N2 + ": " + reduceToSingleDigit(N2));
    }
}
