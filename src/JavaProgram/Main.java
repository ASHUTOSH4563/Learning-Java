package JavaProgram;
//import java.util.*;
//class Main {
//    /* prints element and NGE pair for
//     all elements of arr[] of size n */
//    static void printNGE(int arr[], int n)
//    {
//        int next, i, j;
//        for (i = 0; i < n; i++) {
//            next = -1;
//            for (j = i + 1; j < n; j++) {
//                if (arr[i] < arr[j]) {
//                    next = arr[j];
//                    break;
//                }
//            }
//            System.out.print( next+" ");
//        }
//    }
//
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//        printNGE(arr, n);
//    }
//}
import java.util.*;

class Main {
    /* prints element and NGE pair for
     all elements of arr[] of size n */
    static void printNGE(int arr[], int n)
    {
        Stack<Integer> s = new Stack<Integer>();
        int[] nge = new int[n];
        Arrays.fill(nge, -1);

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
                nge[s.pop()] = arr[i];
            }
            s.push(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        printNGE(arr, n);
    }
}
