class Solution {
    int majorityElement(int arr[]) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue() > arr.length /2) return entry.getKey();
        }
        return -1;
    }
}
