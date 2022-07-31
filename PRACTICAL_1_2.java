// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-
// Given a string, return a string made of the first 2 chars (if present), however include
// first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"
// yields "oz".
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"
import java.util.Scanner;

public class PRACTICAL_1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String A=sc.nextLine();
        startOZ(A);
    }
    //This function takes string as an argument and check if first character is o or not and also check second character is z or mot.
    static void startOZ(String a)
    {
        if(a.charAt(0)=='O' || a.charAt(0)=='o')
        {
            System.out.print(a.charAt(0));
        }
        if(a.charAt(1)=='z' || a.charAt(1)=='Z')
        {
            System.out.print(a.charAt(1));
        }
    }

}
