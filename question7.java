package JAVA8;

interface Test1{
    default void display(){
        System.out.println("Interface 1");
    }
}
interface Test2{
    default void display(){
        System.out.println("Interface 2");
    }
}
public class question7 implements Test1,Test2{
    public void display(){
       System.out.println("Hi");
    }
    public static void main(String[] args){
        question7 q = new question7();
        q.display();
    }
}