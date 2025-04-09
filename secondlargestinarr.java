public class secondlargestinarr {
    public static void main(String[] args) {
        int[] arr = { -4, -5, -1, -3 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println("Largest element in array: " + max);
        System.out.println("Second largest element in array: " + smax);
    }
}
