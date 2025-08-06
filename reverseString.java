//Iterative way
// public class reverseString{

//     public static String revString(String str){
//         StringBuilder rev=new StringBuilder();
//         for(int i=str.length()-1; i>=0;i--){
//             rev=rev.append(str.charAt(i));
//         }
//         return rev.toString();

//     }

//     public static void main(String[] args){
//         String str="hello";
//         String output=revString(str);

//         System.out.println("Original String: "+str);
//         System.out.println("Reversed String: "+output);

//     }

// }
//--------------------------------------------------------------------
//Recursive way
public class reverseString{

    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        else{
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args){
        String str="hello";
        String output=reverse(str);

        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+output);
    }
}