
public class RemoveDupSorted {

    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0)
            return 0;

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != uniqueIndex) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 6, 6 };
        int length = removeDuplicate(arr);
        for (int i = 0; i <= length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
