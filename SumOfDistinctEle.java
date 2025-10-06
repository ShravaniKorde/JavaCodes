// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        // int sum=0;
        
        // HashSet<Integer> set = new HashSet<>();
        // for(int x : arr){
        //     set.add(x);
        // }
        // for(int x: set){
        //     sum+=x;
        // }
        // return sum;
        
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int x: arr){
            if(set.add(x)){
                sum+=x;
            }
        }
        return sum;
    }
}
