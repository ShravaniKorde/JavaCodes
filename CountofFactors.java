import java.util.*;

public class CountofFactors {

    public static int countFactors(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++; // perfect square
                } else
                    count += 2; // both i and n/i
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
        System.out.println("Number of factors:" + countFactors(n));
    }
}
