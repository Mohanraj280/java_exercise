public class SingleDigitDifference {
    
    public static int reduceToSingleDigit(int n) {
        while (n >= 10) {
            int temp = 0;
            String numStr = String.valueOf(n);
            for (int i = 0; i < numStr.length() - 1; i++) {
                int digit1 = Character.getNumericValue(numStr.charAt(i));
                int digit2 = Character.getNumericValue(numStr.charAt(i + 1));
                temp = Math.abs(digit1 - digit2);
                n = temp;
            }
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
