import java.util.Scanner;
public class Practice2 {
    public static void main(String args[])
    {
        Practice pro1=new Practice();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name : ");
        String a=sc.nextLine();
        pro1.putname(a);
        System.out.println("Enter email : ");
        String b=sc.nextLine();
        pro1.putemail(b);
        System.out.println("Enter city : ");
        String c=sc.nextLine();
        pro1.putcity(c);
        System.out.println("Enter contact : ");
        String d=sc.nextLine();
        pro1.putcontact(d);
        System.out.println("Name : "+pro1.getname());
        System.out.println("Email : "+pro1.getemail());
        System.out.println("City : "+pro1.getcity());
        System.out.println("Contact : "+pro1.getcontact());
        sc.close();
    }
}
