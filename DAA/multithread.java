import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;
class square extends Thread{
int num;
square(int n,String name){
super(name);
num=n;
start();
}
public void run()
{
System.out.println(this.getName()+"\t square is\t"+(int)Math.pow(num,2));
}}
class cube extends Thread{
int num;
cube(int n,String name)
{
super(name);
num=n;
start();
}
public void run()
{
System.out.println(this.getName()+"\tcube is\t"+(int)Math.pow(num,3));

}}
class randomgen extends Thread{
int r;
randomgen(String name){
super(name);
start();
}
public void run()
{
Random rand=new Random();
while(true)
{
r=rand.nextInt(10);
System.out.println(this.getName()+"\trandom number is\t"+r);
square s=new square(r,"thread 1");
cube c=new cube(r,"thred 2");
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println("interrupted");
}
}

}}
class multithread{
public static void main(String args[]){
randomgen d=new randomgen("random");
}}
