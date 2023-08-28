package JavaProgram;

public class Student {
    String name;
    int marks;
    int Age;
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Ashu";
        s1.marks=84;
        s1.Age=21;
        Student s2=new Student();
        s2.name="Rohit";
        s2.marks=50;
        s2.Age=21;
        Student s3=new Student();
        s3.name="Madhu";
        s3.marks=65;
        s3.Age=21;
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

//        for(int i=0;i<3;i++)
//        System.out.println(students[i].name+" : "+students[i].marks);
        for(Student stud:students){
            System.out.println(stud.name+" : "+stud.Age);
        }
    }
}
