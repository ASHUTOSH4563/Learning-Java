package JavaProgram;
import java.util.*;
public class Sort_Ac_Freq {
    public static int []freSort(int arr[])
    {
        int[] answer=new int[100];
        boolean[] visited=new boolean[arr.length];
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int count=0;

           if(IsVisited(arr,visited,arr[i])==false && arr[i]!=arr[j])
           {

           }
        }



        return answer;
    }
    public static boolean IsVisited(int arr[],boolean visited[],int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                visited[i]=true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int []result=freSort(arr);
        for(int i=0;i<result.length-1;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println(result[result.length-1]);
    }
}
