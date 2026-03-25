// package streamreduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx9 {
     public static void main(String[]args){
        List<Integer>list=Arrays.asList(12,23,34,45,45,34,23);
        long firsthigh=list.stream().reduce(0,(a,b)->a>b?a:b);
        long sechigh=list.stream().reduce(1,(a,b)->a>b && a<firsthigh?a:b);
        System.out.println(sechigh);
    }
    
    
}
