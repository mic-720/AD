public class MaxMin {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,-1};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
