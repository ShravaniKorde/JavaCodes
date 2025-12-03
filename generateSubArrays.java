class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        
         List<List<Integer>> res = new ArrayList<>();
    
          for(int i = 0;i<arr.length;i++){
              
              for(int j = i;j<arr.length;j++){
                  
                  List<Integer> sub = new ArrayList<>();
                  for(int k = i;k<=j;k++){
                      
                      sub.add(arr[k]);
                  }
                 res.add(sub); 
              }
          }
          return res;
    }
}

//-------------------------------------Using Recursion----------------------------------------------

// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        
         List<List<Integer>> res = new ArrayList<>();
         generate(arr, 0, 0, res);
         return res;
    }
    
 
    private void generate(int[] arr, int start, int end, List<List<Integer>> res){
        if(start==arr.length)
            return;
        
        if(end==arr.length){
            generate(arr, start+1, start+1, res);
            return;
        }
        
        List<Integer> sub = new ArrayList<>();
        for(int i = start; i<=end; i++){
            sub.add(arr[i]);
        }
        res.add(sub);
        
        generate(arr, start, end+1, res);
    }   
}

