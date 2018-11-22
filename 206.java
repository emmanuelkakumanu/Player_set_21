
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.next();
		boolean st=true;int k=0;
		char hex[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','A','B','C','D','E','F'};
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			for(int j=0;j<hex.length;j++)
			{
				if(ch==hex[j])
				{
					k++;
				}
			}
		}
		if(k==str.length())
		System.out.print("yes");
		else
		System.out.print("no");
		
	}
}
