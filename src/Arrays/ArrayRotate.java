package Arrays;
import java.util.*;
public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int d=3;
		//Naive approach to rotate d times
		/*for(int i=0;i<d;i++)
		{
			int j,tmp=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=tmp;
		}*/
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}
	public static void reverse(int arr[], int i, int j)
	{
		int temp;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}		
	}

}
