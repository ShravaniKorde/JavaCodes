public class swapnos {
    public static void main(String[] args) {
        int x=10, y=20;

        System.out.println("Original numbers:"+x +" " +y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After swapping numbers:"+x +" " +y);

    }
}

