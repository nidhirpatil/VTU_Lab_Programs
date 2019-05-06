
import java.util.Scanner;
class prog81
{
 public static void main(String[] args)
 {
  Scanner input=new Scanner(System.in);
  System.out.println("enter the size of graph");
  int n=input.nextInt();
  int g[][]=new int[n][n];
  System.out.println("enter graph");
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    g[i][j]=input.nextInt();
   }
  }
System.out.println("enter graph");
for(int i=0;i<n;i++)
{
 for(int j=0;j<n;j++)
 {
  System.out.println(g[i][j]+"\t");
 }
System.out.println(" ");
}
System.out.println("\n\n\nRunning Kruskal's Algorithm...");
KruskalAlgorithm graphOne=new KruskalAlgorithm();
graphOne.minimumCost(g,n);
}
}
class KruskalAlgorithm
{
 Scanner input=new Scanner(System.in);
 int minimumCost(int g[][],int n)
 {
  int vertex=1;
  int min=9999;
  int cost=0;
  int u=0;
  int v=0;
  int a=0;
  int b=0;
  int parent[]=new int[n];
  for(int i=0;i<n;i++)
  {
   parent[i]=i;
  }
while(vertex<n)
{
 min=9999;
 for(int i=0;i<n;i++)
 {
  for(int j=0;j<n;j++)
  {
   if(g[i][j]<min)
   {
    min=g[i][j];
    u=i;
    v=j;
    a=i;
    b=j;
   }
  }
 }
while(parent[u]!=u)
{
 u=parent[u];
}
while(parent[v]!=v)
{
 v=parent[v];
}
if(u!=v)
{
 cost=cost+min;
 vertex=vertex+1;
 parent[b]=a;
System.out.println("edge:"+a+"--("+min+")--"+b);
}
g[a][b]=g[b][a]=9999;
}
System.out.println("cost:"+cost);
return cost;
}
}

