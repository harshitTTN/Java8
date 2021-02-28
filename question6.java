package JAVA8;
import java.util.function.Consumer;
interface Int1 {
    default void dmet(){
        System.out.println("Default");
    }
    public static void smet(String str)
    {
        System.out.println(str);
    }
}
public class question6 implements Int1{
    public void dmet()
    {
        Int1.super.dmet();
    }
    public static void main(String[] args)
    {
        Consumer<String> cons = Int1::smet;
        cons.accept("Static ");
        question6 q6 = new question6();
        q6.dmet();
    }
}
