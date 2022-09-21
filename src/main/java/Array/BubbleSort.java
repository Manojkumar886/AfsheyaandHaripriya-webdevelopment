package Array;

import java.util.Arrays;

public class BubbleSort {
	public void bubble(int[] arr1)
	{
		int lvalue=arr1.length;
		for(int i=0;i<lvalue;i++)
		{
			for(int j=0;j<lvalue-i-1;j++)
			{
				if(arr1[j]<arr1[j+1])
				{
					int  swap=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=swap;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
	int [] arr= {12,45,67,57,18,21,43,12};
	System.out.println(Arrays.toString(arr));
	BubbleSort sort=new BubbleSort();
	sort.bubble(arr);
	System.out.println("After Sorting"+Arrays.toString(arr));
	}
}
