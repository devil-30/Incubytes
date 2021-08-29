import java.util.*;
import java.io.*;
class StringCalculator
{
    public int Add(String numbers)
    {
        if(numbers==null)
            return 0;
        else
        {
            ArrayList<Integer> NArray=new ArrayList<Integer>();
            char[] ch=numbers.toCharArray();
            for(char c:ch)
            {
                if(Character.isDigit(c))
                {
                    int a=Character.getNumericValue(c);
                    NArray.add(a);
                }
            }
            int sum=0;
            for(Integer value:NArray)
            {
                if(value<=1000)
                    sum+=value;
            }
            return sum;
        }
    }
    int count=1;
    public int GetCalledCount()
    {
        return count++;
    }
}
class calcy
{
    public static void main(String args[])
    {
        try{
            int op,c,choice=1,y=1;
            Scanner scan=new Scanner(System.in);
            StringCalculator sc=new StringCalculator();
            while(choice==1 && y==1)
            {
                System.out.print("Enter String:- ");
                String s=scan.next();
                op=sc.Add(s);
                c=sc.GetCalledCount();
                System.out.println("Sum of Integers is "+op);
                System.out.println(c+" times Add() was invoked");
                try{
                    System.out.println("Press 1 for Continue and 2 for Exit");
                    choice=scan.nextInt();
                }catch(InputMismatchException b){y=1;}
            }
        }catch(Exception e){System.out.println(e);}
    }
}