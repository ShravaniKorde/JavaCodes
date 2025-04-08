import java.util.*;

public class RemoveDuplicatesUnsorted {

    public static int[] removeDuplicate(int[] arr) {
        Set<Integer> uniqueSet = new LinkedHashSet<>(); // Preserves the order

        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 6, 3, 2, 2, 5, 7, 9, 1, 3, 2, 1, 5 };
        int[] result = removeDuplicate(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
