class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer> res = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]>=maxi){
                maxi=arr[i];
                res.add(maxi);
            }
        }
        Collections.reverse(res);
        return res;
        
    }
}
