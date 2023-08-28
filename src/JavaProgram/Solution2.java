package JavaProgram;

class Solution {
    public static void rotate(int[] nums, int k)
    {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=n-k;j<n;j++){
                nums[i]=nums[j];
            }
            nums[k+1]=nums[i];
        }
        return ;
    }
    public static void main(String args[]){
        int nums[]={3,4,6,8,9,10};
        int k=3;

    }
}
