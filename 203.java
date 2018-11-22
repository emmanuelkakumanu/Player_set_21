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
		
		//System.out.println(Arrays.toString(count));
		HashMap<Integer,String> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			map.put(count[i],str[i]);
		}
		//System.out.println(map);
		ArrayList<Integer> ar=new ArrayList<>(map.keySet());
		
		Collections.sort(ar,Collections.reverseOrder());
		//System.out.println(ar);
		Iterator itr=ar.iterator();
		String re[]=new String[n];k=0;
		while(itr.hasNext())
		{
			int el=(Integer)itr.next();
			re[k++]=map.get(el);
		}
		System.out.print(re[0]);
		for(int i=1;i<k;i++)
		System.out.print("\n"+re[i]);
		

	}
}
