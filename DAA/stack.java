import java.util.Scanner;
public class stack
{
static int max=10,top=-1;
static Scanner sc=new Scanner(System.in);
static int arr[]=new int[max];
public static void main(String[] args)
{
int ch;

while(true)
{
System.out.println("1-push" +" "+"2-pop"+" "+"3-display");
System.out.println("enter choice");
ch=sc.nextInt();
switch(ch)
{
case 1:push();
       break;
case 2:pop();
       break;
case 3:display();
       break;
default:System.exit(0);
}
}
}
public static void push()
{
if(top==max-1)
{
System.out.println("stack overflow");

}
else{
System.out.println("enter element");
arr[++top]=sc.nextInt();
}
}
public static void pop()
{
if(top==-1)
{
System.out.println("stack underflow");

}
else
{
System.out.println("deleted element"+arr[top--]);


}
}
public static void display()
{
int i;
if(top==max-1)
{
System.out.println("stack overflow");

}
else
{
for(i=0;i<=top;i++)
{
System.out.println(arr[i]);

}
}
}
}












