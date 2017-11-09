package Strings;

public class StringPermutations {
	public static void main(String[] args)
	{
		StringBuilder str=new StringBuilder("ABCD");
		permute(str,0,str.length()-1);
	}
	public static void permute(StringBuilder str, int left, int right)
	{
		if(left == right)
			System.out.println(str);
		else
		{
			for(int i=left;i<=right;i++)
			{
				swap(str,left,i);
				permute(str,left+1,right);
				swap(str,left,i);
			}
		}
	}
	public static void swap(StringBuilder str, int a, int b)
	{
		char temp=str.charAt(a);
		str.setCharAt(a, str.charAt(b));
		str.setCharAt(b, temp);		
	}

}
