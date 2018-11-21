
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
		int n=s.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		str[i]=s.next();
		int count[]=new int[n];int k=0;
		for(String var:str)
		{
			int cnt=0;
			for(int j=0;j<var.length();j++)
			{
				char ch=var.charAt(j);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					cnt++;
				}
			}
			count[k++]=cnt;
		}
		//System.out.print(Arrays.toString(count));
		
		HashMap<String, Integer> map = new HashMap<>(); 
		for(int i=0;i<n;i++)
		{
			map.put(str[i],count[i]);
		}
		Collections.sort(map);
		for(int i=0;i<n;i++)
		{
			String tmp=map.get(count[i]);
			System.out.print(tmp+" ");
		}
		
	}
}
