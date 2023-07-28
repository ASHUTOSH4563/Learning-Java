package JavaProgram;
import java.util.*;
public class Balanced_parenthesis {
    static boolean matching(Integer a, char b){
        return ((a=='('&& b==')')||(a=='{'&& b=='}')||(a=='[' && b==']'));
    }
    static boolean IsBalaced(String str)
    {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                s.push((int) str.charAt(i));
            }
            else if(s.isEmpty()==true){
                return false;
            }
            else if(matching(s.peek(),str.charAt(i))==false){
                return false;
            }
            else{
                s.pop();
            }
        }
        return s.isEmpty()==true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Stack<Integer> s=new Stack<>();
        String str=sc.nextLine();
        System.out.println(IsBalaced(str));
    }
}
