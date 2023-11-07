
public class RLinearSearch {
	public static int search(int[] arr,int index,int key) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==key) {
			return index;
		}
		else {
			return search(arr,index+1,key);
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {4,3,2,1,5};
		int key=5;
		System.out.println("Key --> "+key+" is present at index --> "+search(arr,0,key));
	}

}
