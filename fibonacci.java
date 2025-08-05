//Using iterative way

// public class fibonacci{
//     public static void main(String[] args){
//         int n=10;
//         int a=0, b=1;

//         System.out.println("Fibonacci series are:");
//         for (int i=1;i<=n;i++){
//         int sum=a+b;
//         System.out.println(a + " ");
//         a=b;
//         b=sum;
//         }
       
//     }
// }
//----------------------------------------
// Using recursive method

// public class fibonacci{
//     public static int fibo(int n){
//         if(n==0)
//             return 0;
//         if(n==1)
//             return 1;
//         return fibo(n-1)+fibo(n-2);
//     }

//     public static void main(String[] args){
//         int n=10;
//         System.out.println("The fibonacci series are:");
//         for(int i=0;i<n;i++){
//             System.out.println(fibo(i));
//         }
//     }
// }
//-------------------------------
//Using memoization
import java.util.HashMap;
public class fibonacci{
    static HashMap<Integer,Integer> memo = new HashMap<>();

    static int fibo(int n){
        if(n<=1) return n;

        if (memo.containsKey(n))
            return memo.get(n);

        int res=fibo(n-1)+fibo(n-2);
        memo.put(n,res);
        return res;
    }

    public static void main(String[] args){
        int n=10;
        System.out.print("Fibonacci series are:"+fibo(n));
    }
}