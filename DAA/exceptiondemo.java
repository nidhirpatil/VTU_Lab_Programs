import java.util.Scanner;
import java.io.*;
import java.lang.*;
class exceptiondemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a and b");
int a,b;
a=sc.nextInt();
b=sc.nextInt();
try{
System.out.println(a/b);
}
catch(Exception exc)
{
System.out.println("exception handled");
exc.printStackTrace();
}
finally{
System.out.println("code after exception handling");
}}} 
