//find first repeated element in an array

import java.util.Arrays;

public class Q1 {
	//Time Complexity : O(n*logn)
	//Space Complexity: O(1)
	//Works with all the inputs
	public static int firstRepeated1(int[] arr,int n) {
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]-arr[i+1]==0) {
				return arr[i];
			}
		}
		return -1;
	}
	//Time Complexity: O(n*n)
	//Space Complexity: O(1)
	//Works with all the inputs
	public static int firstRepeated2(int[] arr,int n) {
		int count=0;
		for(int i=0;i<n;i++) 
		{
			count=0;
			for(int j=i+1;j<n;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					count++;
				}
				if(count>=1) 
				{
					return arr[i];
				}
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {-2,1,2,4,7,6,6,7,7};
		int ans=firstRepeated1(arr,arr.length);
		System.out.println(ans);
	}
}
