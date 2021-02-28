package JAVA8;

import java.util.List;
import java.util.stream.Collectors;

public class question12 {
    public static void main(String[] args){
        List<Integer> num = List.of(4,7,10,1,2);
       int res =  num.stream()
                .filter(x->x%2==0)
                .filter(x->x>3)
               .findFirst().get();

               System.out.println(res);
    }
}
