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
		String str=s.nextLine();
		String re=new String();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				re=re+Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				re=re+Character.toUpperCase(ch);
			}
			else
			{
				re=re+ch;
			}
		}
		System.out.print(re);
	}
}
