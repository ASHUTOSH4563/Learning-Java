package JavaProgram;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class Stream_API
{
    public static void main(String args[]){
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
        Consumer<Integer> con=new Consumer<Integer>(){
            public void accept(Integer n){

            }
        };
        nums.forEach(con);
    }
}
