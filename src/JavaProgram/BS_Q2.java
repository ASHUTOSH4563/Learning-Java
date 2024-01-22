package JavaProgram;
//find square root of a number

public class BS_Q2
{
    //Brute force approach.............................................................................................................................
//    static int Sqrt(int n)
//    {
//        int i=1;
//        while(i*i<=n)
//        {
//            i++;
//        }
//        return (i-1);
//    }

    //Efficient approach using binary search..........................................................................................................................
    static int Sqrt(int n){
        int low=1,high=n,ans=-1;
        while(low<=high){
            int mid=(high+low)/2;
            int msq=mid*mid;
            if(msq==n){
                return mid;
            }else if(msq>n){
                high=mid-1;
            }else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        int n=196;
        int sqrt=Sqrt(n);
        System.out.println("Square root of the number is: "+ sqrt);

    }
}
