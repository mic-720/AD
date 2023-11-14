//Given an array of integers ,find the element pair with minimum/maximum difference
import java.util.*;
public class Q4 {
	//Time Complexity: O(n*logn)
	public static void maxMinDiff(int[] arr,int n){
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		int a=0,b=0;
		System.out.println("("+arr[0]+" "+arr[n-1]+")");
		for(int i=0;i<n-1;i++) {
			int diff=arr[i+1]-arr[i];
			if(min>diff) {
				min=diff;
				a=i;
				b=i+1;
			}
		}
		System.out.println("("+arr[a]+","+arr[b]+")");
	}
	public static void main(String[] args) {
		int[] arr= {1,13,4,19,16,12};
		maxMinDiff(arr,arr.length);
		
	}

}
