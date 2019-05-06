import java.util.Scanner;
import java.io.*;
class staff{
String na,ph,id,sa;
Scanner input=new Scanner(System.in);
staff(String i,String n,String p,String s)
{
na=n;
ph=p;
id=i;
sa=s;
}
public void display()
{
System.out.println("\n name:"+na+"\n staff id:"+id+"\n salary:"+sa+"phone:"+ph);
}
}
class teaching extends staff
{
String dom,pb;
teaching(String i,String n,String p,String s,String d,String pub)
{
super(i,n,s,p);
pb=pub;
dom=d;
}
public void display()
{
super.display();
System.out.println("publication:"+pb+"\ndomain:"+dom);
}
}
class technical extends staff{

String sk;
technical(String i,String n,String p,String s,String skill)
{
super(i,n,s,p);

sk=skill;
}
public void display()
{
super.display();
System.out.println("skills:"+sk);
}
}
class contract extends staff{

String pe;
contract(String i,String n,String p,String s,String period)
{
super(i,n,s,p);
pe=period;
}
public void display()
{
super.display();
System.out.println("period:"+pe);
}
}
class staffDemo{
public static void main(String args[])
{
Scanner input =new Scanner(System.in);
String id[]=new String[3];
String s[]=new String[3];
String n[]=new String[3];
String p[]=new String[3];
String d[]=new String[3];
String pb[]=new String[3];
teaching t1[]=new teaching[3];
System.out.println("enter details of teaching staff");
for(int i=0;i<3;i++)
{
System.out.println("teaching staff number"+" "+(i+1));
System.out.println("enter name,id,salary,phone number,domain,publication");
n[i]=input.nextLine();
id[i]=input.nextLine();
s[i]=input.nextLine();
p[i]=input.nextLine();
d[i]=input.nextLine();
pb[i]=input.nextLine();
t1[i]=new teaching(id[i],n[i],p[i],s[i],d[i],pb[i]);
}
String sk[]=new String[3];
technical t2[]=new technical[3];
System.out.println("enter details of technical staff");
for(int i=0;i<3;i++)
{
System.out.println("technical staff number"+" "+(i+1));
System.out.println("enter name,id,salary,phone number,domain,skills");
n[i]=input.nextLine();
id[i]=input.nextLine();
s[i]=input.nextLine();
p[i]=input.nextLine();
sk[i]=input.nextLine();
t2[i]=new technical(id[i],n[i],p[i],s[i],sk[i]);
}
String period[]=new String[3];
contract t3[]=new contract[3];
System.out.println("enter details of contract staff");
for(int i=0;i<3;i++)
{
System.out.println("teaching contract number"+" "+(i+1));
System.out.println("enter name,id,salary,phone number,period");
n[i]=input.nextLine();
id[i]=input.nextLine();
s[i]=input.nextLine();
p[i]=input.nextLine();
period[i]=input.nextLine();
t3[i]=new contract(id[i],n[i],p[i],s[i],period[i]);
}
System.out.println("details of teaching staff");
for(int i=0;i<3;i++)
t1[i].display();
System.out.println("details of technical staff");
for(int i=0;i<3;i++)
t2[i].display();
System.out.println("details of contract staff");
for(int i=0;i<3;i++)
t3[i].display();
}
}
