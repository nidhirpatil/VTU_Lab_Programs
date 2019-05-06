import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;
import java.util.Scanner;
class tokenizer
{
public static void main(String args[])
{
String n,d;
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
n=sc.nextLine();
System.out.println("enter date of birth in form dd/mm/yyyy");
d=sc.next();
System.out.print("\t"+n);
StringTokenizer st=new StringTokenizer(d,"/");
while(st.hasMoreElements())
{
System.out.print(" "+ st.nextElement());
}
}
}

