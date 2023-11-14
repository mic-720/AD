//print all the duplicates in an array
import java.util.ArrayList;

public class Q2 {
	//Time Complexity: O(n)
	//Space Complexity: O(n)
	public static ArrayList<Integer> duplicates(int[] arr,int n){
		int[] freq=new int[n];
		ArrayList<Integer> ls=new ArrayList<>();
		ls.add(0,-1);
		int idx=0;
		for(int i=0;i<n;i++) {
			freq[arr[i]]+=1;
		}
		for(int i=0;i<n;i++) {
			if(freq[i]>=2) {
				if(idx==0) {
					ls.remove(0);
				}
				ls.add(idx++,i);
			}
		}
		return ls;
	}
	public static void main(String[] args) {
		int[] arr= {1,1, 2, 3, 4, 2, 7, 8, 8, 3};
		System.out.println(duplicates(arr,arr.length));
	}
}
