//Find the missing number in an array

import java.util.Arrays;

public class Q3 {
	public static int missing(int[] arr,int n) {
		int num=1;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				num++;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int[] arr= {7,5,6,3,1,4,2};
		int missingNumber=missing(arr,arr.length);
		System.out.println(missingNumber);
	}
}
