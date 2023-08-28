package JavaProgram;
import java.util.*;
public class Avg_Salary {
    public static double average(int[] salary)
    {
        Arrays.sort(salary);
        int sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        int avg=sum/salary.length-2;
        return avg;
    }
    public static void main(String args[]){
        int salary[]={1000,2000,3000};
        System.out.println(average(salary));

    }
}
