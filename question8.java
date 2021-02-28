package JAVA8;
interface T1{
    default void display(){
        System.out.println("Interface 1");
    }
}
interface T2{
    default void display(){
        System.out.println("Interface 2");
    }
}
public class question8 implements T1,T2{
    public void display(){
        T1.super.display();
        T2.super.display();
    }
    public static void main(String[] args){
        question8 q = new question8();
        q.display();
    }
}
