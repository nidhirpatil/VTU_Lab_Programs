import java.util.*;
class hamilton{
private int adj[][],x[],n;
public  hamilton(){
Scanner src=new Scanner(System.in);
System.out.println("enter no. of nodes");
n=src.nextInt();
x=new int[n];
x[0]=0;
for(int i=1;i<n;i++){
x[i]=-1;
}
adj=new int[n][n];
System.out.println("enter the adjacency matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
adj[i][j]=src.nextInt();
}}
}
public void nextvalue(int k)
{
int i=0;
while(true){
x[k]=x[k]+1;
if(x[k]==n){
x[k]=-1;
}
if(x[k]==-1)
{
return;
}
if(adj[x[k-1]][x[k]]==1)
{
for(i=0;i<k;i++)
{
if(x[i]==x[k]){
break;
}}
if(i==k){
if(k<n-1||k==(n-1)&&adj[x[n-1]][0]==1){
return;
}
}
}
}
}
public void hamiltonx(int k){
while(true){
nextvalue(k);
if(x[k]==-1){
return;
}
if(k==(n-1))
{
System.out.println("solution");
for(int i=0;i<n;i++){
System.out.print((x[i]+1)+"");
}
System.out.println();
}
else
{
hamiltonx(k+1);
}}}
}
class hamiltonproblem{
public static void main(String args[])
{
hamilton obj=new hamilton();
obj.hamiltonx(1);
}}



             
