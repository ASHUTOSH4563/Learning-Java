package JavaProgram;
//find the first occurance , last occurance and the count of element in a sorted array where repeatating element allowed
public class BS_Q1
{
    static int first_occurance(int arr[],int low,int high,int k)
    {
        if(low<=high) {
            int mid = (low + high) / 2;
            if(arr[mid]==k)
            {
               //first occurance of element
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                } else {
                    return first_occurance(arr,low,mid-1,k);
                 }
            }
            else if(arr[mid]<k)
            {
                return first_occurance(arr,mid+1,high,k);
            }
            else
            {
                return first_occurance(arr,low,mid-1,k);
            }
        }
        return -1;
    }
    //last occurance of element in a sorted array where repetating numbers are present
    static int Last_occurance(int arr[],int low,int high,int k)
    {
        if(low<=high) {
            int mid = (low + high) / 2;
            if(arr[mid]==k)
            {
                if(mid==arr.length-1|| arr[mid]!=arr[mid+1]){
                    return mid;
                }else{
                    return Last_occurance(arr,mid+1,high,k);
                }
            }
            else if(arr[mid]<k)
            {
                return Last_occurance(arr,mid+1,high,k);
            }
            else
            {
                return Last_occurance(arr,low,mid-1,k);
            }
        }
        return -1;
    }
    static int Count_occurances(int arr[],int low,int high,int k)
    {
        int first=first_occurance(arr,low,high,k);
        if(first==-1){
            return 0;
        }
        return Last_occurance(arr,low,high,k)-first+1;
    }
//      static int Count_occurances(int arr[],int k)
//      {
//        int low=0;
//        int high=arr.length-1;
//          while (low <= high) {
//              int mid = low + (high - low) / 2;
//
//              if (arr[mid] == k) {
//                  int count = 1;
//
//                  // Check for occurrences to the left
//                  int left = mid - 1;
//                  while (left >= 0 && arr[left] == k) {
//                      count++;
//                      left--;
//                  }
//
//                  // Check for occurrences to the right
//                  int right = mid + 1;
//                  while (right < arr.length && arr[right] == k) {
//                      count++;
//                      right++;
//                  }
//
//                  return count;
//              } else if (arr[mid] < k) {
//                  low = mid + 1;
//              } else {
//                  high = mid - 1;
//              }
//          }
//          return -1;
//      }
    public static void main(String args[])
    {
        int arr[]={20,20,20,20,20,20};
        int first_occurance=first_occurance(arr,0,arr.length-1,20);
        int last_occurance=Last_occurance(arr,0,arr.length-1,20);
        int count=Count_occurances(arr,0,arr.length-1,20);
        if(first_occurance!=-1){
            System.out.println("The first occurance of k is :"+ first_occurance);
            System.out.println("The last occurance of k is :"+ last_occurance);
        }else{
            System.out.println("Element not found in that array ");
        }
        System.out.println("The count of number k is :"+ count);
    }
}
