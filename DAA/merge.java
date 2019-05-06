import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;
class mergesort{
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
quicksort(a,n-1);
end=System.nanoTime();
bwr.write(Integer.toString(n));
bwr.write("\t");
bwr.write(Long.toString(end-start));
bwr.write("\n");
}
bwr.close();
}





public void mergesort(int a[],int y)
{
int[] b=new int[20000];
int[] c=new int[20000];
int k,w=0;
if(y>1)
{
for(i=0;i<y/2;i++)
{
b[i]=a[i];
}
mergesort(b,y/2);
k=y-y/2;
for(int i=y/2;i<y;i++,w++)
{
c[w]=a[i];
}
mergesort(c,k);
merge(a,b,c,y);
}
public void merge(int a[],int b[],int c[],int y)
{
int i=0,j=0,k=0;
int z=y-y/2;
while(i<y/2&&j<z)
{
if(b[i]<c[j])
{
a[k]=b[i];
i++;
}
else{
a[k]=c[j];
j++;
}
k++;
}
while(j<z)
{
a[k]=c[j];
j++;
k++;
}
}
