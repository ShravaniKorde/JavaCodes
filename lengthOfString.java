class Solution {
    public static int lengthString(String str) {
        int cnt = 0;
        for(char ch:str.toCharArray()){
            cnt++;
        }
        return cnt;
    }
}
