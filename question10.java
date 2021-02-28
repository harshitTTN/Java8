package JAVA8;

import java.util.List;
import java.util.stream.Collectors;

public class question10 {
    public static void main(String[] args){
        List<Integer> num = List.of(4,7,10,1,2);
        List<Integer> newL =  num.stream().filter(x->x>5).collect(Collectors.toList());
        int sum = newL.stream().reduce(0,Integer::sum);
        System.out.println(sum);

    }
}
