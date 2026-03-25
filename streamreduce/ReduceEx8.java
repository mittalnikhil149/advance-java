// package streamreduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx8 {
     public static void main(String[]args){
        List<Integer>list=Arrays.asList(1,2,3,4,5,6);
        long result=list.stream().reduce(0,(a,b)->b*b+a);
        System.out.println(result);
    }
    
    
}
