// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-Given 2 strings, a and b, return the number of the positions where they contain the
// same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
// and "az" substrings appear in the same place in both strings.
// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0
import java.util.Scanner;
import static java.lang.Math.min;

public class PRACTICAL_1_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String a=sc.next();
        System.out.println("Enter second string : ");
        String b=sc.next();
        int c=stringMatch(a,b);
        System.out.println(c);
    }
    //This function takes two string as an argument and return how many substring of length 2 are same in both strings.
     static int stringMatch(String x,String y)
    {
        int count=0;
        int f=min(x.length(),y.length());
        for(int i=0;i<f-1;i++)
        {   //String z will store substring of size 2 of first string.
            String z=x.substring(i,i+2);
            //String t will store substring of size 2 of second string.
            String t=y.substring(i,i+2);
            //Here we compare both substrings are same or not.
            if(z.equals(t))
            {
                count++;
            }
        }
        return count;
    }
}
