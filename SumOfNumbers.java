
public class SumOfNumbers {
    public static int sum(int[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }   
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int ans=sum(arr,arr.length);
        System.out.println(ans);
    }

}
