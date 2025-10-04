class Solution {
    public int countDigits(int n) {
    
    int cnt = 0;
    while(n>0){
        int ld = n%10;
        cnt++;
        n = n/10;
    }
   return cnt;
    
    }
        
}
