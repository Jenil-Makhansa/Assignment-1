// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-Given two non-negative int values, return true if they have the same last digit, such
// as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
// 10 is 7.
// lastDigit(7, 17) → true
// lastDigit(6, 17) → false
// lastDigit(3, 113) → true
import java.util.Scanner;

public class PRACTICAL_1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        boolean c=lastDigit(a,b);
        System.out.println(c);
    }
    //This function takes two integer as an argument and return true if last digit of both integer are same else it return false.
    static boolean lastDigit(int x,int y)
    {
        if(x%10 == y%10)
            return true;
        else
            return false;
    }
}
