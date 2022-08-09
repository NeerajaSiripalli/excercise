import java.util.*;
public class StringOperations {
    public static void main(String args[]){
        String s1 = "Neeraja";
        String s2 = "Siripalli";

        char c;
       String  k =" ";
        System.out.println(s1.length());
        System.out.println(s2.length());
        for(int i=0;i<s1.length();i++){
            c = s1.charAt(i);
            k = c+k;
        }
        System.out.println(k);
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));

    }
}
