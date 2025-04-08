import java.util.*;

public class noswithoutloop {
    public static void print(int i) {
        if (i == 0) // base case
            return;

        print(i - 1); // call (Recursion)
        System.out.print(i + " "); // work
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);

        sc.close();
    }
}