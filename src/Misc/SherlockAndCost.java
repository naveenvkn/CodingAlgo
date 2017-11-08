package Misc;

import java.util.Scanner;

public class SherlockAndCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}*/
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int size=sc.nextInt();
            long arr[]=new long[size];
            for(int j=0;j<size;j++)
                arr[i]=sc.nextInt();
            long sum[][]=new long[size][2];
            for(int j=1;j<size;j++)
            {
                sum[j][0]=Math.max(sum[j-1][0]+(1-1),sum[j-1][1]+(arr[j-1]-1));
                sum[j][1]=Math.max(sum[j-1][0]+(arr[j]-1),sum[j-1][1]+(arr[j]-arr[j-1]));
            }
            System.out.println(Math.max(sum[size-1][0],sum[size-1][1]));
        }
	}

}
