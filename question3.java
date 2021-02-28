package JAVA8;
import java.util.function.BiFunction;
class mul_div{
    public static int mul(int a, int b)
    {
        return a*b;
    }
    public static int div(int a, int b)
    {
        return a/b;
    }
}
class add_sub{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
}
public class question3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mul = mul_div::mul;
        BiFunction<Integer, Integer, Integer> div = mul_div::div;
        BiFunction<Integer, Integer, Integer> add = new add_sub()::add;
        BiFunction<Integer, Integer, Integer> sub = new add_sub()::sub;
        int prod = mul.apply(20, 30);
        int quo = div.apply(500, 3);
        int sum = add.apply(10, 40);
        int diff = sub.apply(30, 20);
        System.out.println("Product (static reference) : " + prod);
        System.out.println("Division (static reference) : " + quo);
        System.out.println("Addition (instance reference) : " + sum);
        System.out.println("Subtraction (instance reference) : " + diff);

    }
}