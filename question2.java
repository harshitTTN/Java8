package JAVA8;
import java.util.*;
import java.util.function.BiFunction;
public class question2 {
    public static void main(String[] args)
    {
        List<Integer> nums = List.of(1,2,3,4,5);

        BiFunction<Integer,Integer,Integer> func= new BiFunction<Integer,Integer,Integer>(){

            public Integer apply(Integer a, Integer b)
            {
                return a*b;
            };
        } ;

        Integer result = func.apply(6,3);
        System.out.println(result);

    }
}