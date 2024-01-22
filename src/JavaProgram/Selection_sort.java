package JavaProgram;

public class Selection_sort
{
    public static void main(String args[])
    {
        int nums[]={8,3,6,1,7,5};
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            int highest=nums[0];
            int index=0;
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j+1]>highest){
                    highest=nums[j+1];
                    index=j+1;
                }
            }
            temp=nums[nums.length-i-1];
            nums[nums.length-i-1]=nums[index];
            nums[index]=temp;
        }
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}
