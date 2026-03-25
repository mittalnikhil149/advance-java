package streamreduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx5 {
   public static void main(String[]args){
        List<Integer>list=Arrays.asList(12,23,34,45,45,34,23);
        long result=list.stream().reduce(0,(a,b)->a+1);
        System.out.println(result);
    }
    
    
}
