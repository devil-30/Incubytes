import java.util.*;
import java.io.*;
class StringCalculator
{
    public int Add(String numbers)
    {
        if(numbers==null)
            System.out.println("0");
        else
        {
            
        }
    }
}
class calcy
{
    public static void main(String args[])
    {
        try{
            int op;
            Scanner scan=new Scanner(System.in);
            StringCalculator sc=new StringCalculator();
            System.out.print("Enter String:- ");
            String s=scan.next();
            op=sc.Add(s);
        }catch(Exception e){System.out.println(e);}
    }
}