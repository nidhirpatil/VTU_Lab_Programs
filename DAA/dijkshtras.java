import java.util.*;

import java.util.Scanner;
import java.io.*;
class dijkshtras{
public static void printdistance(int dis[],int src,int n)
{
for(int i=0;i<n;i++)
{
System.out.println("distance from"+src+"to t"+i+"is"+dis[i]);
}}
public static void algorithm(int adg[][],int src,int n,int dis[],int par[],int vis[])
{
int u=-1,v,i,j,min;
for(i=0;i<n;i++){
if(adg[src][i]!=999&&vis[i]==0){
dis[i]=adg[src][i];
par[i]=src;
}}
for( i=1;i<n;i++){
min=999;
for( j=0;j<n;j++)
{
if(dis[j]<min &&vis[j]==0)
{
min=dis[j];
u=j;
}}
vis[u]=1;
for(v=0;v<n;v++){
if((dis[u]+adg[u][v]<dis[v])&&vis[v]==0){
dis[v]=dis[u]+adg[u][v];
par[v]=u;
}}}}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number of vertices");
int n=sc.nextInt();
int adg[][]=new int[n][n];
int vis[]=new int[n];
int par[]=new int[n];
int dis[]=new int[n];
System.out.println("enter the graph");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
adg[i][j]=sc.nextInt();
}}
System.out.println("the graph");
for(int i=0;i<n;i++)
{
System.out.println();
for(int j=0;j<n;j++)
{
System.out.print(adg[i][j]+"\t");
}}
System.out.println("enter the source");
int src=sc.nextInt();

for(int i=0;i<n;i++){
dis[i]=999;
par[i]=-1;
vis[i]=0;}


vis[src]=1;
par[src]=-1;
dis[src]=0;
algorithm(adg,src,n,dis,par,vis);
printdistance(dis,src,n);



}}
