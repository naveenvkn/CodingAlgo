//This pgm is to find the min number of steps taken to reach from 1 to n
// by adding 1 or multiplying by 2 or 3
//We can alter any operation sjust by adding if for these operations
package Misc;

import java.util.Scanner;

public class Steps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=Integer.MAX_VALUE;
		int f[]=new int[n+1];
		f[1]=0;
		for(int i=2;i<=n;i++)
			f[i]=max;
		for(int i=1;i<=n;i++)
		{
			if(f[i]==max)
				continue;
			if(2*i<=n && f[i]+1<f[2*i])
				f[2*i]=f[i]+1;
			if(3*i<=n && f[i]+1<f[3*i])
				f[3*i]=f[i]+1;
			if(i+1<=n && f[i]+1<f[i+1])
				f[i+1]=f[i]+1;
		}
		System.out.println("Steps: "+f[n]);
	}

}
