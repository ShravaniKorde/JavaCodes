
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int low = 0, high=k-1, n=arr.length, sum = 0, res = 0;
        for(int i =low;i<=high;i++){
            sum = sum+arr[i];
            res = sum;
        }
        while(high<n-1){
            low++;
            high++;
            sum = sum -arr[low-1];
            sum = sum+arr[high];
            res= Math.max(res,sum);
        }
        return res;
    }
}
