package JavaProgram;
//class hi extends Thread
//{
//    public void run()
//    {
//        for(int i=1;i<=5 ;i++){
//            System.out.println("hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class hello extends Thread{
//    public void run(){
//        for(int i=1;i<=5;i++){
//            System.out.println("hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//public class Demo_Th
//{
//    public static void main(String args[]){
//        hi obj=new hi();
//        hello obj1=new hello();
//
//        obj.start();
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        obj1.start();
//
//    }
//}
//implementation with Runnable interface
//class hi implements Runnable
//{
//    public void run()
//    {
//        for(int i=1;i<=5 ;i++){
//            System.out.println("hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class hello implements Runnable{
//    public void run(){
//        for(int i=1;i<=5;i++){
//            System.out.println("hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//public class Demo_Th
//{
//    public static void main(String args[]){
//        Runnable obj=new hi();
//        Runnable obj1=new hello();
//
//        Thread t1=new Thread(obj);
//        Thread t2=new Thread(obj1);
//        t1.start();
//        t2.start();
//
//    }
//}
//*******************************************************************
//Rewritting the code using Anonymous class and lambda expression.
// Remember Runnble is a function interface thats why we can use lamda expression here

//class hi implements Runnable
//{
//    public void run()
//    {
//        for(int i=1;i<=5 ;i++){
//            System.out.println("hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class hello implements Runnable{
//    public void run(){
//        for(int i=1;i<=5;i++){
//            System.out.println("hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

public class Demo_Th
{
    public static void main(String args[]){
        Runnable obj=()->
        {
                for(int i=1;i<=5 ;i++){
                    System.out.println("hi");
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Runnable obj1=()->
        {
                for(int i=1;i<=5;i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();

    }
}
