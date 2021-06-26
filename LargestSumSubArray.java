// The Logic of this code is to fetch all the sub-arrays and then calculate the sum of each. 
// Ultimately finding out the largest sum

package dynamicProgramming;

public class LargestSumArray 
{
	public static void getSumN3(int arr[]) // O(n^3) complexity
	{
		int finalSum = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i; j<arr.length; j++)
			{
				int currentSum = 0;
				for(int k =i ; k<=j; k++)
				{
					currentSum = currentSum+arr[k];	
				}
				if(currentSum>finalSum)
				{
					finalSum = currentSum;
				}
			}
		}
		System.out.println(finalSum);
	}
	
	public static void getSumN2(int arr[]) // O(n^2) Complexity
	{
		int len = arr.length;
		int finalSum = Integer.MIN_VALUE;
		int sum[] = new int[len];
		sum[0]=arr[0];
		for(int i = 1; i<len; i++)
		{
			sum[i]=sum[i-1]+arr[i];
			System.out.print(sum[i] + " ");
		}
		for(int i = 0; i<len; i++)
		{
			int currentSum = 0;
			for(int j = i; j<len; j++)
			{
				currentSum = sum[j]-sum[i]+arr[i];
				System.out.println(currentSum);
				if(currentSum>finalSum)
					finalSum = currentSum;
			}
			
		}
		System.out.println(finalSum);
	}
	
	public static void KadenAlgo(int arr[]) //This Algo is very imp READ about it. 
	{
		
	}
	public static void main(String args[])
	{
		int arr[] = {-3, 2, 4, -1, 2, 3, -2};
		//sum array={-3, -1,3,  2, 4, 7,  5}
		//getSumN3(arr);
		getSumN2(arr);
	}

}


