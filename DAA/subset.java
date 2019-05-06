import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;
class subset{
int m,n,v=0;
int x[]=new int[10];
int w[]=new int[10];
public void sub(int s,int k,int r)

{


x[k]=1;
if(s+w[k]==m)
{
v=v+1;
System.out.print("\t subset:");
for(int i=0;i<=k;i++){
if(x[i]==1){
System.out.print("\t"+w[i]);
}}
System.out.println();
}

else if(s+w[k]+w[k+1]<=m)
{
if(k<n-1){
sub(s+w[k],k+1,r-w[k]);
}
}
if((s+r-w[k]>=m)&&(s+w[k+1]<=m && k<=(n-1))){
x[k]=0;
sub(s,k+1,r-w[k]);
}}


public static void main(String args[]){
subset obj=new subset();
Scanner scanner=new Scanner(System.in);
System.out.println("enter no. of elements");
obj.n=scanner.nextInt();
int a[]=new int[obj.n];
System.out.println("enter the elements");
for(int i=0;i<obj.n;i++){
a[i]=scanner.nextInt();
}
System.out.println("enter limit");
obj.m=scanner.nextInt();
for(int f=0;f<obj.n-1;f++)
{
for(int l=0;l<(obj.n-f-1);l++){
if(a[l]>a[l+1]){
int p;
p=a[l];
a[l]=a[l+1];
a[l+1]=p;
}
}
}
int sum=0;
for(int i=0;i<obj.n;i++)
{
obj.w[i]=a[i];
sum=sum+a[i];
}
for(int i=0;i<obj.n;i++)
{
obj.x[i]=0;}
obj.sub(0,0,sum);
if(obj.v==0){
System.out.println("no solution");
}
return;
}
}
































