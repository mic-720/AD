import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        // Integer in=Integer.valueOf(4);
        // ArrayList<Integer> l1=new ArrayList<>();
        // l1.add(1);
        // l1.add(2);
        // l1.add(3);
        // l1.add(4);
        
        // System.out.println(l1.get(1));
        // for(int i=0;i<l1.size();i++){
        //     if(i!=l1.size()-1){
        //     System.out.print(l1.get(i)+" ");
        //     }
        //     else{
        //         System.out.println(i);
        //     }
        // }
        // System.out.println(l1);
        // l1.add(1,100);
        // System.out.println(l1);
        // l1.set(1, 10);
        // System.out.println(l1);
        // l1.remove(1);
        // System.out.println(l1);
        // l1.remove(Integer.valueOf(2));
        // System.out.println(l1);
        // System.out.println(l1.remove(Integer.valueOf(7)));
        // boolean ans=l1.contains(Integer.valueOf(31));
        // System.out.println(ans);
        // ArrayList al=new ArrayList();
        // al.add("al");
        // al.add(1);
        // al.add('2');
        // System.out.println(al);
         
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        int i = 0;
        int j = arr.size()-1;
        while (i < j) {
            Integer temp = Integer.valueOf(arr.get(i));
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
        Collections.reverse(arr);
        Collections.sort(arr);
        Collections.sort(arr,Collections.reverseOrder());
    }
}