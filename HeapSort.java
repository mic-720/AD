import java.util.Arrays;

public class HeapSort {
	public static void buidlHeap(int[] arr,int n) {
		for(int i=n-1;i>=1;i--) {
			heapify(arr,n,i);
		}
	}
	public static void heapify(int[] arr,int n,int i) {
		int largest=i;
		int left=2*i;
		int right=2*i+1;
		if(left<n && arr[left]>arr[largest]) {
			largest=left;
		}
		if(right<n && arr[right]>arr[largest]) {
			largest=right;
		}
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
	}
	public static void heapSort(int[] arr,int n) {
		buidlHeap(arr,n);
		for(int i=n-1;i>=1;i--) {
			int temp=arr[n-1];
			arr[n-1]=arr[1];
			arr[1]=temp;
			n--;
			heapify(arr,n,1);
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,5,3,6,2,4};
		int size=arr.length;
		heapSort(arr,size);
		System.out.println(Arrays.toString(arr));
	}

}
