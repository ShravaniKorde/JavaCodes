
import java.util.*;
public class printDivisors {

    public static List<Integer> divisors(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i*i<=n; i++){
            if(n%i == 0){
                al.add(i);
                if(n/i!=i){
                    al.add(n/i);
                }
            }
        }
        Collections.sort(al);
        return al;
    }

    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(divisors(n));
        sc.close();

    }
    
}
