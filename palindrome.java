import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.nextLine();
    
        str=str.toLowerCase();

        boolean isPalindrome=true;
        int i=0, j=str.length() - 1 ;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome=false;
                break;
            }
            i++;
            j--; 
        }
       

        if(isPalindrome)
            System.out.println("String is palindrome");
        else 
            System.out.println("String is not palindrome");
    }
}