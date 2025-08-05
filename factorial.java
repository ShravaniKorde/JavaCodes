//Using iterative method

// public class factorial{
//     public static void main(String[] args){
//         int n=5;
//         int fact=1;

//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.print("Factorial of number is:"+fact);
//     }
// }

//Using recursive method

public class factorial{
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        int n=5;
        int res=factorial(n);
        System.out.println("Factorial of number " +n +  " is: " +res);

    }
}