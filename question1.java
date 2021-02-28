package JAVA8;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
public class question1 {
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer> great = (x,y)->x>y;
        boolean b = great.test(9, 8);
        System.out.println(b);
        Consumer<Integer> inc = (x)->System.out.println(++x);
        inc.accept(7);
        BiFunction<String,String,String> concat = (x,y)->x+y;
        String name = concat.apply("Harshit", "Cheems");
        System.out.println(name);
        UnaryOperator<String> up = (x)->x.toUpperCase();
        String uc = up.apply("doge");
        System.out.println(uc);
    }
}
// class::fuc
//new class::funct