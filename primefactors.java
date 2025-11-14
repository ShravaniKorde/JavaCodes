
import java.util.ArrayList;


public class basics {
  
    public static void main(String[] args) {
        int n = 780;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 2; i< Math.sqrt(n); i++){
            if(n%i==0){
                al.add(i);
                while(n%i==0) n=n/i;  // keep on divinf the no. till it is divisible by i
            }
        }
        if(n!=1) al.add(n);
        System.out.println(al);
    }
}
