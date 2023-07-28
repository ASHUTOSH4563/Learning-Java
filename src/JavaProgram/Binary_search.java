package JavaProgram;

import java.util.Arrays;

public class Binary_search {
    public static int BS(int arr[],int k){
        Arrays.sort(arr);
        int low=0,high=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(k>arr[mid]){
                low=mid+1;
            }
            else if(k<arr[mid]){
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=5;
        System.out.println(BS(arr,k));
    }
}
