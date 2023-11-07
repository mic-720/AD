import java.util.Arrays;

public class SubarrayReverseSorted1 {
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static boolean sortArr(int[] arr){
        int x=-1;
        int y=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                if(x==-1){
                    x=i;
                }
                y=i+1;
            }
        }
        if(x!=-1){
            reverse(arr, x, y);
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,4,3};
        boolean ans=sortArr(arr);
        System.out.println(ans);
    }    
}
