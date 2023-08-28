package JavaProgram;

public class Merge2
{
    public static int[] MergeArr(int[] arr1, int[] arr2)
    {
        int n=arr1.length+arr2.length;
        int arr3[]=new int[n];
        int i=0;int j=0;int k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        return arr3;
    }
    public static void main(String args[]) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int n = arr1.length + arr2.length;
        int arr3[] = MergeArr(arr1,arr2);
        System.out.print("Merged array:");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+ " ");
        }
    }
}
