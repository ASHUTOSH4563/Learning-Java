package JavaProgram;
import java.util.*;
public class Solution1 {
    static int SecondLargest(int a[],int n){
        int largest=a[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }else if(a[i]>slargest &&a[i]< largest){
                slargest=a[i];
            }
        }
        return slargest;
    }
    static int SecondSmallest(int a[],int n){
        int smallest=a[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                ssmallest=smallest;
                smallest=a[i];
            }else if(a[i]<ssmallest && a[i]>smallest){
                ssmallest=a[i];
            }
        }
        return ssmallest;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        int slargest=SecondLargest(a,n);
        int ssmallest=SecondSmallest(a,n);
        return new int[]{slargest,ssmallest};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] result = getSecondOrderElements(n,a);

        int[] output = new int[2];
        output[0] = result[0]; // Second largest element
        output[1] = result[1]; // Second smallest element

        System.out.println("Output array: " + Arrays.toString(output));
    }
}
