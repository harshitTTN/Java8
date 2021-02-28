package JAVA8;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class question5 {
    public static void main(String[] args)
    {
        Consumer<String> cons = (str)->System.out.println(str);
        cons.accept("Harshu");
        Function<Integer,Integer> func= (x)-> x*x;
        int a = func.apply(10);
        System.out.println(a);
        Predicate<Integer> pred = (x)-> x%2==0;
        boolean b = pred.test(10);
        System.out.println(b);
        Supplier<String> supp= ()->"No input";
        String s = supp.get();
        System.out.println(s);

    }

}