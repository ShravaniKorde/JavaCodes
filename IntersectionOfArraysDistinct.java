class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for(int x : a){
            set.add(x);
        }
        for(int x : b){
            if(set.contains(x)){
                count++;
                set.remove(x);
            }
        }
        return count;
    }
}
