
public class BinarySearch {
	public static int Bsearch(int[] arr,int key) {
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		while(start<=end){
			if(arr[mid]==key) {
				return mid;
			}
			if(key>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			mid=start+(end-start)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int key=5;
		System.out.println("Key --> "+key+" is present at index --> "+Bsearch(arr,key));
		
	}
}
