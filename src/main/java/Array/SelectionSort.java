package Array;

import java.util.Arrays;

public class SelectionSort {
	public void selectionsort(int[] arr1)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
					arr1[i]^=arr1[j];
					arr1[j]^=arr1[i];
					arr1[i]^=arr1[j];
				}
			}
		}
	}

	public static void main(String[] args) 
	{
			int [] arr= {70,38,58,45,33,52,60};
			
			System.out.println(Arrays.toString(arr));
			SelectionSort sort=new SelectionSort();
			sort.selectionsort(arr);
			
			System.out.println(Arrays.toString(arr));
			
	}

}
