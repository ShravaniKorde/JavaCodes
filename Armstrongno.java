class Solution {
    static boolean armstrongNumber(int n) {
        
        int sum = 0;
        int dup = n;
        
        while(n!=0){
            int ld = n%10;
            sum = sum + (ld * ld * ld);
            n = n/10;
        }
        if(dup == sum) return true;
        return false;
    }
}
