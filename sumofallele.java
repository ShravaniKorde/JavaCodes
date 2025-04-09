import java.util.*;

public class sumofallele {
    public static void main(String[] args) {
        System.out.println("Enter length:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
        sc.close();
    }
}
