package JAVA8;


import java.util.List;
import java.util.stream.Collectors;

public class question9 {
    public static void main(String[] args){
        List<Integer> num = List.of(5,7,10,1,2);
        List<Integer> evenL = num.stream().filter(x->x%2 == 0).collect(Collectors.toList());

        for(Integer i : evenL){
            System.out.println(i);
        }

    }
}
