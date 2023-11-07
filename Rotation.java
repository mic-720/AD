import java.util.Arrays;
public class Rotation {
    public static int[] rotate(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=7;
        k=k%n;
        arr=rotate(arr,0,k-1);
        arr=rotate(arr, k, n-1);
        arr=rotate(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
