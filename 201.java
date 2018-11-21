import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0)
		System.out.print("1");
		if(n==1 || n==2)
		{
			System.out.print("1 1");
		}
		if(n>2)
		{
			System.out.print("1 1");
			for(int j=2;j<=n;j++)
			{
				long temp=Cat.fact(2*j);
				long temp1=Cat.fact(j+1);
				long temp2=Cat.fact(j);
				long re=temp/(temp1*temp2);
				System.out.print(" "+re);
			}
		}
	}
	static long fact(int k)
	{
		long f=1;
		for(int i=1;i<=k;i++)
		{
			f=f*i;
		}
		return f;
	}
}
