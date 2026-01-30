class Solution {
    public int longestKSubstr(String s, int k) {
        
        int n = s.length();
        int low = 0, high = 0;
        int res = -1;
        
        HashMap<Character, Integer> f = new HashMap<>();

         while (high < n){
             
            char ch = s.charAt(high);    // add character present at high
            f.put(ch, f.getOrDefault(ch, 0) + 1);
            high++;
          
            
            if(f.size()>k){
                char leftChar = s.charAt(low);
                f.put(leftChar, f.get(leftChar) - 1);   //decrease the freq of left char in map

                if (f.get(leftChar) == 0)    //if the left char is 0 means there's no freq left, simply remove it directly
                    f.remove(leftChar);
                low++;
            }
            
            if(f.size()==k){
                int len=high-low;
                res=Math.max(len,res);
            }
        }
        return res;
        
    }
}
