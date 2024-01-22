package JavaProgram;

public class Bubble_sort
{
    public static void main(String args[]){
        int arr[]={6,7,5,8,4,2};
        int size=arr.length;
        int temp=0;
        System.out.println("before Sorting");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println();
        System.out.println("after Sorting");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}
