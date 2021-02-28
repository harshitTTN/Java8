package JAVA8;

import java.util.List;
import java.util.stream.Collectors;

public class question11 {
    public static void main(String[] args){
        List<Integer> num = List.of(4,7,10,1,2);
        List<Integer> newL =  num.stream().map(x->x*2).collect(Collectors.toList());
        int sum = newL.stream().reduce(0,Integer::sum);
        int avg = sum / newL.size();
        System.out.println(avg);

    }
}
