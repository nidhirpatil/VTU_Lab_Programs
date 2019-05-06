import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;
class quicksort{
Scanner input=new Scanner(System.in);
public static void main(String args[])throws Exception{
int[] a=new int[15000];
Random rand=new Random();
long start;
long end;
FileWriter writer=new FileWriter("out.txt");
BufferedWriter bwr=new BufferedWriter(writer);
quicksort x=new quicksort();
for(int n=5000;n<=10000;n=n+50){
for(int i=0;i<n;i++){
a[i]=rand.nextInt(1000);
}
start=System.nanoTime();
quicksort(a,0,n-1);
end=System.nanoTime();
bwr.write(Integer.toString(n));
bwr.write("\t");
bwr.write(Long.toString(end-start));
bwr.write("\n");
}
bwr.close();
}
public static void quicksort(int []a,int f,int r)
{
if(f<r)
{
int s=partition(a,f,r);
quicksort(a,f,(s-1));
quicksort(a,s+1,r);
}}
static int partition(int []a,int f,int r)
{
int pivot=a[r];
int i=f-1;
for(int j=f;j<=r-1;j++)
{
if(a[j]<=pivot)
{
i++;
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}}
int temp=a[r];
a[r]=a[i+1];
a[i+1]=temp;
return(i+1);
}}
