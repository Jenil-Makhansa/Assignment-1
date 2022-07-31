// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-Given an array of strings, return a new array without the strings that are equal to
// the target string. One approach is to count the occurrences of the target string, make
// a new array of the correct length, and then copy over the correct strings.
// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
import java.util.Scanner;

public class PRACTICAL_1_6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array : ");
    int a=sc.nextInt();
    String[] b=new String[a];
    System.out.println("Enter array : ");
    for(int i=0;i<b.length;i++)
    {
        b[i]=sc.next();
    }
    System.out.println("Enter string you want to remove");
    String c=sc.next();
    wordsWithout(b,c);
    }
    //This function take string array and a string that we wanted to remove from array as an argument and print the array by removing the string that we wanted to remove.
    static void wordsWithout(String x[],String y)
    {   int count=0;
        //This for loop is check how many numbers of string are same and we have to remove from the array.
        for(int i=0;i<x.length;i++)
        {
            if(x[i].equals(y))
            {
                count++;
            }
        }
        //We make an array after removing the size of same element.
        String[] d=new String[x.length-count];
        int j=0;
        //This for loop assign string in string array if it is not equal to removal string.
        for(int i=0;i<x.length;i++)
        {
            if(x[i].equals(y))
            {}
            else
            {
                d[j]=x[i];
                j++;
            }
        }
        System.out.println("New Array is :");
        //Print an array with removing the string that we want.
        for(String element:d)
        {
            System.out.println(element);
        }
    }
}
