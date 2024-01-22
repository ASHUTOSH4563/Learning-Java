package JavaProgram;
import java.util.*;
class Students{
    int age;
    String name;
    public Students(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "Students [age=" + age + ", name="+ name+ "]";
    }
}

public class Comparator_AL
{
    public static void main(String args[]){
        Comparator<Students> com=new Comparator<Students>() {
            public int compare(Students i, Students j)
            {
                if(i.age>j.age){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        List<Students> studs=new ArrayList<>();
        studs.add(new Students(21,"Ashutosh"));
        studs.add(new Students(27,"Navin"));
        studs.add(new Students(18,"John"));
        studs.add(new Students(30,"Atul"));
        Collections.sort(studs,com);
        for(Students s:studs)
        System.out.println(s);
    }
}
