import java.util.*;

public class StringChangeCase {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);

            if (ch == ' ')
                continue;// if string ignore space
            int asci = (int) ch;// typecast char to int

            if (asci >= 97)
                flag = false;// lowercase

            if (flag == true) {// uppercase
                asci += 32;// diff between uppercase and lowercase is 32
                char dh = (char) asci;
                str.setCharAt(i, dh);

            } else {// lowercase
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.print(str);
        sc.close();
    }
}
