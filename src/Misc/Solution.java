package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		int num[]= {1,2,3};
		List<List<Integer>> l=permute(num);
		System.out.println(l);
	}
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        permuteList(nums,0,nums.length-1,l);
        return l;
        
    }
    public static void permuteList(int[] num, int left, int right, List<List<Integer>> l)
    {
        if(left == right)
        {
            ArrayList la=new ArrayList();
            for(int i=0;i<num.length;i++)
            {
            	la.add(num[i]);
            }
            l.add(la);
        }
        else
        {
            for(int i=left;i<=right;i++)
            {
                swap(num,left,i);
                permuteList(num,left+1,right, l);
                swap(num,left,i);
            }
        }
            
    }
    public static void swap(int[] num, int a, int b)
    {
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
}