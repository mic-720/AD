
public class RBinarySearch {
	public static int search(int[] arr,int start,int end,int key) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==key) {
			return mid;
		}
		else if(arr[mid]<key) {
			return search(arr,mid+1,end,key);
		}
		else{
			return search(arr,start,mid-1,key);
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int key=6;
		int n=arr.length;
		System.out.println("Key --> "+key+" is present at index --> "+search(arr,0,n-1,key));
	}
}
