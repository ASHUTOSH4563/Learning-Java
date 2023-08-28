package JavaProgram;
import java.util.Arrays;

public class Array_Merge {
    public static void main(String args[]){
        int arr1[]={1,2,3,7};
        int arr2[]={5,6,7,8};
        int c1=arr1.length+arr2.length;
        int arr3[]=new int[c1];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=arr1.length;i<c1;i++){
            arr3[i]=arr2[i-arr1.length];
        }
        Arrays.sort(arr3);
        for(int i=0;i<c1;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
