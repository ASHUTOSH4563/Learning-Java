package JavaProgram;
import java.util.*;
import java.util.Arrays;

public class Binary_search{
//    public static int BS(int arr[],int k){
//        Arrays.sort(arr);
//        int low=0,high=arr.length;
//        while(low<=high)
//        {
//            int mid=(low+high)/2;
//            if(arr[mid]==k){
//                return mid;
//            }
//            else if(k>arr[mid]){
//                low=mid+1;
//            }
//            else if(k<arr[mid]){
//                high=mid-1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String args[]){
//        int arr[]={1,2,3,4,5,6,7};
//        int k=5;
//        System.out.println(BS(arr,k));
//    }
    static int BS(int arr[],int first_index,int last_index,int k)
    {
        if(first_index<=last_index)
        {
            int mid = (first_index + last_index) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                return BS(arr, 0, mid - 1, k);
            } else {
                return BS(arr, mid + 1, arr.length - 1, k);
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
       // Scanner sc=new Scanner(System.in);
        int arr[]={2,5,7,15,20,21};
        int Index_of_K= BS(arr,0,arr.length-1,5);
        if(Index_of_K!=-1) {
            System.out.println("The Index of the element K is " + Index_of_K);
        }else{
            System.out.println("Element is not in the ");
        }
    }
}
