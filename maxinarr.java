
public class maxinarr {
    public static void main(String[] args) {
        int[] arr = { -4, -5, -3, -1, -2 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
