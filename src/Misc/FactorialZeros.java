package Misc;

//Counting the number of zeros in a factorial of a given number
public class FactorialZeros {
	public static void main(String[] args)
	{
		int n=30;
		int count=0;
		//Solution1
		for(int i=2;i<=n;i++)
		{
			int j=i;
			while(j%5==0)
			{
				count++;
				j=j/5;
			}
		}
		System.out.println("Number of Zeros"+count);
		//Solution2
		count=0;
		for(int i=5;n/i>0;i*=5)
			count += n/i;
		System.out.println("Number of Zeros"+count);
	} 
}
