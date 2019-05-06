import java.util.Scanner;
class kruskal{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter size of graph");
int n=input.nextInt();
int G[][]=new int[n][n];
/*System.out.println("enter graph");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
G[i][j]=input.nextInt();
}}
System.out.print("entered graph");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(G[i][j]+"\t");
}
System.out.print("");
}System.out.println("\nRunning Prim's Algorithm");
primsalgorithm graphone=new primsalgorithm();
graphone.minimumcost(G,n);*/
System.out.println("enter graph");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
G[i][j]=input.nextInt();
}}
System.out.println("entered graph");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++){
System.out.print(G[i][j]+"\t");
}
System.out.println();
}
System.out.println("\n running kruskals algorithm");
kruskalsalgorithm graphtwo=new kruskalsalgorithm();
graphtwo.minimumcost(G,n);
}}
/*class primsalgorithm{
Scanner input=new Scanner(System.in);
int minimumcost(int G[][],int n){
int vertex=0,min=999,cost=0,u=0,v=0;
int visited[]=new int[n];
for(int i=0;i<n;i++){
visited[i]=0;
}
visited[0]=1;
vertex=vertex+1;
while(vertex<n)
{
min=999;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(visited[i]==1&&visited[j]==0&&G[i][j]<min){
u=i;
v=j;
min=G[i][j];
}}}
if(visited[u]==1&&visited[v]==0){
visited[v]=1;
cost=cost+min;
vertex=vertex+1;
G[u][v]=G[v][u]=999;
System.out.println("edges:"+u+"-("+min+")-"+v);
}}
System.out.println("cost:"+cost);
return(cost);
}}*/
class kruskalsalgorithm{
Scanner input=new Scanner(System.in);
int minimumcost(int g[][],int n){
int vertex=0,min=999,cost=0,u=0,v=0,a=0,b=0;
int parent[]=new int[n];
for(int i=0;i<n;i++){
parent[i]=i;
}

while(vertex<n){
min=999;
for(int i=0;i<n;i++)
{
for(int j=0;i<n;j++){

if(g[i][j]<min){
min=g[i][j];
u=i;
v=j;
a=i;
b=j;
}}}

while(parent[u]!=u)
{
u=parent[u];
}
while(parent[v]!=v)
{
v=parent[v];
}

if(u!=v){
cost=cost+min;
vertex=vertex+1;
parent[b]=a;
System.out.println("edges:"+a+"-("+min+")-"+b);
}
g[a][b]=g[b][a]=999;
}
System.out.println("cost:"+cost);
return(cost);
}}









