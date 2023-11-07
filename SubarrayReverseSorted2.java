// Java program to check whether reversing a  
// sub array make the array sorted or not 
public class SubarrayReverseSorted2 {
    public static void main(String[] args){
        int[] arr={1,2,5,4,3};
        //make the copy of the given array
        //sort the copied array for comparision
        int[] copy={1,2,3,4,5};
        int left=arr.length-1;;
        int right=0;
        boolean ans=true;
        //finding the first mis-match
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=copy[i]){
                left=i;
                break;
            }
        }
        //finding the last mis-match
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=copy[i]){
                right=i;
                break;
            }
        }
        //checking if the sub array is decreasing or not
        for(int i=left;i<=right-1;i++){
            if(arr[i]<arr[i+1]){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
