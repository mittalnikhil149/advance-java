// package streamreduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx10 {
    public static void main(String[]args){
        List<String>list=Arrays.asList("java","Stream","API");
        String result=list.stream().reduce("",(a,b)->a.length()<b.length()?b:a);
        System.out.println(result);
    }
    
}
