



import java.util.*;
import java.io.*;

class floyd{

	public static int minimum(int a,int b)
	{
 		int tmp;
		if(a<b)
		tmp = a;
		else
		tmp = b;
		return tmp;
	}

	public static void algorithm(int d[][] , int n){
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
	for(int k=0;k<n;k++){
		d[i][j] = minimum(d[i][j] , (d[i][k]+d[k][j]));
			}
			}
			}
	}

	public static void main(String []args)
	{
              

		Scanner sc = new Scanner(System.in);
		int n;
        //        int [][]d = new int[n][n];	
		System.out.println("enter the number of elements");
		n = sc.nextInt();
		int [][]d = new int[n][n];
		System.out.println("enter the adjacency matrix");

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				d[i][j]= sc.nextInt();
			}
		}
		algorithm(d,n);
                System.out.println("Transitive closure is");
		for(int i=0;i<n;i++)
		{       System.out.println(" ");
			for(int j=0;j<n;j++)
			{
				System.out.print(d[i][j] + "\t");
			}
		}
		
} 



}


