//Given an array of n-numbers,find the element which appears maximum number of times
public class Q5 {
	//Time Complexity: O(n*n)
	//Space Complexity: O(1)
	public static int maximumOccurence(int[]arr,int n){
		int count=1;
		int ele=arr[0];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			count=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if(count>max) {
					max=count;
					ele=arr[i];
				}
			}
		}
		return ele;
	}
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,2};
		System.out.println(maximumOccurence(arr,arr.length));
	}

}
