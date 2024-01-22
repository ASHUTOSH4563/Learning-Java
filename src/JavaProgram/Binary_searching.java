package JavaProgram;

import java.util.Arrays;

//using recursion
public class Binary_searching {
    public static int BinarySearch(int nums[],int target,int left,int right)
    {
        if(left<=right)
        {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
            {
                return mid;
            } else if (nums[mid] < target)
            {
                return BinarySearch(nums, target,mid+1,right );
            }else{
                return BinarySearch(nums,target,left,mid-1);
            }
        }
        return -1;
    }
    public static void main(String args[]){
         int nums [] ={6,5,3,7,4};
        Arrays.sort(nums);
        int target=7;
        int result=BinarySearch(nums,target,0,nums.length-1);
        System.out.println(result);

    }
}
