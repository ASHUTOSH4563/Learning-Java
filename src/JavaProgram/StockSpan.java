package JavaProgram;
import java.util.*;
import java.util.Scanner;

public class StockSpan {

//    public static void Span(int arr[]) {
//        int n = arr.length;
//        int span[] = new int[n];
//
//        // Initialize the span of the first day as 1.
//        span[0] = 1;
//
//        for (int i = 1; i < n; i++) {
//            span[i] = 1; // Initialize span for the current day.
//
//            // Iterate through previous days and count consecutive days with lower or equal prices.
//            for (int j = i - 1; (j >= 0) && (arr[i] >= arr[j]); j--) {
//                span[i]++;
//            }
//        }
//
//        // Print the stock spans.
//        for (int i = 0; i < n; i++) {
//            System.out.print(span[i] + " ");
//        }
//    }
    public static void Span(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int span=1;
            for(int j=i-1;(j>=0) && arr[j]<=arr[i];j--)
            {
                span++;
            }
            System.out.print(span+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Span(arr);
    }
}
