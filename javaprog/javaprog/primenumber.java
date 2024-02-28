import java.util.ArrayList;

public class primenumber {
    public static void main(String[] args) {
        int num = 20;

        ArrayList<Integer> list = new ArrayList<>();
        for (int n = 1; n <= num; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    if (count == 2) {
                        list.add(n);
                    } else {
                        continue;
                    }
                }
            }

        }
        System.out.println(list);
    }

}