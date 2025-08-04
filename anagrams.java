import java.util.Arrays;

public class anagrams{
    public static void main(String[] args){

        String str1="own";
        String str2="now";

        char[] a1=str1.toCharArray();   
        char[] a2=str2.toCharArray();

        Arrays.sort(a1);    //sorts based on ACII values
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1,a2));

}
}

//without built in functions
// public class anagrams{
//     public static void main(String[] args){
//         String str1="own";
//         String str2="now";

//         if(str1.length()!=str2.length()){
//             System.out.println("false");
//             return;
//         }
//         int[] count=new int[26];
//         for(int i=0;i<str1.length();i++){
//             count[str1.charAt(i) - 'a'] ++;
//             count[str2.charAt(i) - 'a'] --;
//         }

//         for(int i=0;i<26;i++){
//             if(count[i]!=0){
//                 System.out.println("false");
//                 return;
//             }
           
//         }
//          System.out.println("true");
//     }
// }
